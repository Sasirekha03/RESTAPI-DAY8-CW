package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Bike;



public interface BikeRepo extends JpaRepository<Bike, Integer>{
	
	@Query(value="select * from bike where year=:y",nativeQuery=true)
	public List<Bike> getBikeInfo1(@Param("y") int year);
	

	@Query(value="select * from bike where year=:y or bike_name=:bn",nativeQuery=true)
	public List<Bike> getBikeInfo2(@Param("y") int year,@Param("bn") String bikeName);
	
	@Query(value="select * from bike where bike_name=:bn",nativeQuery=true)
	public List<Bike> getBikeInfo3(@Param("bn") String bikeName);
	

}
