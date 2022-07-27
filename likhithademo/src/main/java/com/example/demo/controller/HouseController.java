package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.House;
import com.example.demo.service.HouseService;
import java.util.List;

@RestController
public class HouseController {
	
	@Autowired
	private HouseService houseService;
	
	@PostMapping("/saveHouse")
	public House saveHouses(@RequestBody House house) {
		
		return houseService.saveHouses(house);
	}
	
	@GetMapping("/GetAllHouse")
	public List<House>fetchAllHouseList()
	{
		return houseService.fetchAllHouseList();
	}
	
	@GetMapping("/GetHouseById/{id}")
	public House gethousebyone(@PathVariable("id") Long houseId) {
		return houseService.gethousebyone(houseId);
	}
	
	@GetMapping("/GetHouseByType/{typeof}")
	
	public House gethousebytype(@PathVariable("typeof") String type)
	{
		return houseService.gethousebytype(type);
	}
	
	@DeleteMapping("/deletehouse/{id}")
	public String deletebyid(@PathVariable("id") Long houseId) {
		houseService.deletebyid(houseId);
		return "Department deleted";
		
	}

}
