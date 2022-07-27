package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.House;

public interface HouseService {
	
	public House saveHouses(House house);
	
	public List<House>fetchAllHouseList();
	
	public House gethousebyone(Long houseId);
	
	public House gethousebytype(String type);
	
	public void deletebyid(Long houseId);

}
