package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Cab;
import com.masai.entity.Driver;
import com.masai.entity.DriverDTO;
import com.masai.exception.DriverNotFoundException;
import com.masai.exception.InvalidId;
import com.masai.repository.CabDao;
import com.masai.repository.DriverDao;
@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverDao dDao;
	
	@Autowired
	private CabDao cDao;
	
	@Override
	public Driver insertDriver(Driver driver) {
		Cab cab= driver.getCab();
		cDao.save(cab);
		return dDao.save(driver);
	}

	@Override
	public Driver viewDriverById(Integer id) throws InvalidId {
		if(id<1)
			throw new InvalidId("Id should be more than 1");
		
		Optional<Driver> opt=dDao.findById(id);
		
		return opt.orElseThrow(() -> new DriverNotFoundException("No Driver found for id: "+id));
	}

	@Override
	public Driver updateDriver(Integer id,Integer license, Boolean available) throws DriverNotFoundException{
		Optional<Driver> opt= dDao.findById(id);
		if(opt.isPresent()) {

			Driver fDriver=opt.get();
			fDriver.setLicenseNo(license);
			fDriver.setAvailable(available);
			Cab fCab= fDriver.getCab();
			fCab.setDriver(fDriver);
			cDao.save(fCab);
			return dDao.save(fDriver);

		}
			
		else
			throw new DriverNotFoundException("No Driver found ");
	}

	@Override

	public Driver deleteDriverById(Integer id) throws DriverNotFoundException{
		Optional<Driver> opt=dDao.findById(id);

		if(opt.isPresent()) {
			cDao.delete(opt.get().getCab());
			dDao.delete(opt.get());
			return opt.get();
		}
		else
			throw new DriverNotFoundException("No Driver found ");
	}

	@Override
	public List<Driver> viewBestDriver() throws DriverNotFoundException {
		List<Driver> drivers= dDao.viewBestDriver();
		if(drivers.size()>0)
			return drivers;
		else
			throw new DriverNotFoundException("No Driver found with rating>=4.5");
	}

	@Override
	public DriverDTO getDriverDTOById(Integer id) throws InvalidId {
		if(id<1) 
			throw new InvalidId("id cannot be less than 1");
		Optional<Driver> opt= dDao.findById(id);
		if(opt.isPresent()) {
			return dDao.getDriverDTOById(id);
		}
		else
			throw new DriverNotFoundException("No Driver found with id "+id);
	}

	
	

}
