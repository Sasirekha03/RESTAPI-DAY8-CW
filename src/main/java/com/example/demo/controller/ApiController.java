package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Bike;
import com.example.demo.service.BikeService;


@RestController
public class ApiController {
	@Autowired
	BikeService bs;
	
	@PostMapping("/")
	public List<Bike> addndetails(@RequestBody List<Bike> b)
	{
		return bs.savedetails(b);
	}
	@GetMapping("showdetails")
    public List<Bike> show()
    {
    	return bs.showinfo();
    }

	@GetMapping("year/{year}")
	public List<Bike> showbikedetails1(@PathVariable int year)
	{
		return bs.getb1(year);
	}
	@GetMapping("year/{year}/bikeName/{bikeName}")
	public List<Bike> showstudetails(@PathVariable int year,@PathVariable String bikeName)
	{
		return bs.getb2(year,bikeName);
	}
	@GetMapping("bikeName/{bikeName}")
	public List<Bike> showbikedetails2(@PathVariable String bikeName)
	{
		return bs.getb3(bikeName);
	}
}
