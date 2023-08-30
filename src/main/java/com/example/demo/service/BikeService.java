package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bike;
import com.example.demo.repository.BikeRepo;



@Service
public class BikeService {

	@Autowired
	BikeRepo br;
	
	public List<Bike> savedetails(List<Bike> b)
	{
		return (List<Bike>)br.saveAll(b);
	}
	
	public List<Bike> showinfo()
	{
		return br.findAll();
	}
	public List<Bike> getb1(int y)
	{
		return br.getBikeInfo1(y);
	}
	public List<Bike> getb2(int y,String bn)
	{
		return br.getBikeInfo2(y,bn);
	}
	public List<Bike> getb3(String bn)
	{
		return br.getBikeInfo3(bn);
	}
}
