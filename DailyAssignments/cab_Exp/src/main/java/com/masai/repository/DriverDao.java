package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.entity.Driver;
import com.masai.entity.DriverDTO;
@Repository
public interface DriverDao extends JpaRepository<Driver,Integer> {
@Query("from Driver d where d.rating>=4.5 AND d.available=true")
public List<Driver> viewBestDriver();
@Query("Select new com.masai.entity.DriverDTO(d.userId,d.Username,d.Mobile,d.address,d.Email,d.licenseNo,d.rating,d.available) from Driver d where userId=?1")
public DriverDTO getDriverDTOById(Integer id);
}
