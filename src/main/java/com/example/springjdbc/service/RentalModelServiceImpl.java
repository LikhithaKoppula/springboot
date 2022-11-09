package com.example.springjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springjdbc.exception.PropertyNotFoundException;
import com.example.springjdbc.model.RentalModel;
import com.example.springjdbc.repository.RentalPropertyRepository;

@Service
public class RentalModelServiceImpl implements iRentalModel{

	
	private RentalPropertyRepository rentalrepo;
	
	@Autowired
	public void setRentalrepo(RentalPropertyRepository rentalrepo) {
		this.rentalrepo = rentalrepo;
	}

	@Override
	public void addRentalProperty(RentalModel rentalproperty) {
		// TODO Auto-generated method stub
		rentalrepo.addRentalProperty(rentalproperty);
		
	}

	@Override
	public void updateRentalProperty(int propertyId, double rentExpected) {
		// TODO Auto-generated method stub
		rentalrepo.updateRentalProperty(propertyId, rentExpected);
	}

	@Override
	public void deleteRentalProperty(int propertyId) {
		rentalrepo.deleteRentalProperty(propertyId);
		// TODO Auto-generated method stub
		
	}

	@Override
	public RentalModel getById(int propertyId) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalModel> getByCategory(String category) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalModel> getByType(String type) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalModel> getByRentRange(double start, double end) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalModel> getByLesserDeposit(double deposit) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalModel> getByLocation(String Location) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalModel> getByCity(String City) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
