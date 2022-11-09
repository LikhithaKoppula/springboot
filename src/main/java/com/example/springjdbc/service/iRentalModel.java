package com.example.springjdbc.service;

import java.util.List;

import com.example.springjdbc.exception.PropertyNotFoundException;
import com.example.springjdbc.model.RentalModel;

public interface iRentalModel {

	void addRentalProperty(RentalModel rentalproperty);
	void updateRentalProperty(int propertyId,double rentExpected);
	
	void deleteRentalProperty(int propertyId);
	
	RentalModel getById(int propertyId) throws PropertyNotFoundException;
	
	List<RentalModel>getByCategory(String category) throws PropertyNotFoundException;
	List<RentalModel>getByType(String type) throws PropertyNotFoundException;
	List<RentalModel>getByRentRange(double start,double end) throws PropertyNotFoundException;
	List<RentalModel>getByLesserDeposit(double deposit) throws PropertyNotFoundException;
	
	List<RentalModel>getByLocation(String Location) throws PropertyNotFoundException;
	List<RentalModel>getByCity(String City) throws PropertyNotFoundException;
}
