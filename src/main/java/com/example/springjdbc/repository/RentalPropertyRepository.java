package com.example.springjdbc.repository;

import java.util.List;

import com.example.springjdbc.exception.PropertyNotFoundException;
import com.example.springjdbc.model.RentalModel;

public interface RentalPropertyRepository {
	void addRentalProperty(RentalModel rentalproperty);
	void updateRentalProperty(int propertyId,double rentExpected);
	
	void deleteRentalProperty(int propertyId);
	
	RentalModel findById(int propertyId) throws PropertyNotFoundException;
	
	List<RentalModel>findByCategory(String category) throws PropertyNotFoundException;
	List<RentalModel>findByType(String type) throws PropertyNotFoundException;
	List<RentalModel>findByRentRange(double start,double end) throws PropertyNotFoundException;
	List<RentalModel>findByLesserDeposit(double deposit) throws PropertyNotFoundException;
	
	List<RentalModel>findByLocation(String Location) throws PropertyNotFoundException;
	List<RentalModel>findByCity(String City) throws PropertyNotFoundException;
}
