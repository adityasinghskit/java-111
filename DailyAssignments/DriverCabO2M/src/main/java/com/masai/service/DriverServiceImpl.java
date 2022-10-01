package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Cab;
import com.masai.entity.Driver;
import com.masai.exception.DriverNotFoundException;
import com.masai.exception.InvalidId;
import com.masai.repository.AddressDao;
import com.masai.repository.CabDao;
import com.masai.repository.DriverDao;
@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverDao dDao;
	
	@Autowired
	private CabDao cDao;
	@Autowired
	private AddressDao Adao;
	
	//Insert New Driver
	@Override
	public Driver insertDriver(Driver driver) {
		//Cab cab= driver.getCab();
		//cDao.save(cab);
		return dDao.save(driver);
	}
	//View Driver by ID
	@Override
	public Driver viewDriverById(Integer id) throws InvalidId {
		if(id<1)
			throw new InvalidId("Id should be more than 1");
		
		Optional<Driver> opt=dDao.findById(id);
		
		return opt.orElseThrow(() -> new DriverNotFoundException("No Driver found for id: "+id));
	}
	//Update a Driver
	@Override
	public Driver updateDriver(Integer id,Integer license, Boolean available) throws DriverNotFoundException{
		Optional<Driver> opt= dDao.findById(id);
		if(opt.isPresent()) {

			Driver fDriver=opt.get();
			fDriver.setLicenseNo(license);
			fDriver.setAvailable(available);
			//Cab fCab= fDriver.getCab();
			//fCab.setDriver(fDriver);
			//cDao.save(fCab);
			return dDao.save(fDriver);

		}
			
		else
			throw new DriverNotFoundException("No Driver found ");
	}
	//Delete Driver by ID
	@Override
	public Driver deleteDriverById(Integer id) throws DriverNotFoundException{
          Driver d1=dDao.findById(id).orElseThrow(()-> new DriverNotFoundException("No Driver found"));
        
        
        
	    dDao.delete(d1);
	    //Adao.deleteById(d1.getAddress().getId());
	    //cDao.deleteById(d1.getCab().getCabId());
	    return d1;
			
	}
	//View Best Driver 
	@Override
	public List<Driver> viewBestDriver() throws DriverNotFoundException {
		List<Driver> drivers= dDao.viewBestDriver();
		if(drivers.size()>0)
			return drivers;
		else
			throw new DriverNotFoundException("No Driver found with rating>=4.5");
	}
	//Cancel a trip
	@Override
	public Driver cancelTrip(Integer id) throws DriverNotFoundException {
		Optional<Driver> opt=dDao.findById(id);
		if(opt.get()!=null) {
			Driver d=opt.get();
			d.setAvailable(true);
			dDao.save(d);
			
		}else {
			throw new DriverNotFoundException("No driver found by id: "+id);
		}
		return null;
	}

	
	

}
