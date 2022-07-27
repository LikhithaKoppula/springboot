package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.House;
import com.example.demo.repository.HouseRepository;

@Service
public class HouseServiceImpl implements HouseService{

	@Autowired
	private HouseRepository houseRepository;
	
	@Override
	public House saveHouses(House house) {
		// TODO Auto-generated method stub
		return houseRepository.save(house);
	}

	@Override
	public List<House> fetchAllHouseList() {
		// TODO Auto-generated method stub
		return houseRepository.findAll();
	}

	@Override
	public House gethousebyone(Long houseId) {
		// TODO Auto-generated method stub
		return houseRepository.findById(houseId).get();
	}
	
	@Override
	public House gethousebytype(String type) {
		// TODO Auto-generated method stub
		return houseRepository.findByType(type);
	}
	
	@Override
	public void deletebyid(Long houseId)
	{
		houseRepository.deleteById(houseId);
	}

	
}
