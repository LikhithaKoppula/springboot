package com.example.springjdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.springjdbc.exception.PropertyNotFoundException;
import com.example.springjdbc.model.RentalModel;

@Repository

public class RentalPropertyRepoImpl implements RentalPropertyRepository {

	private JdbcTemplate jdbctemplate;
	
	@Autowired
	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}


	@Override
	public void addRentalProperty(RentalModel rentalproperty) {
		// TODO Auto-generated method stub
		
		String insertquery = "insert into rentalproperty values(?,?,?,?,?,?,?,?,?)";
		Object[] property = {rentalproperty.getPropertyId(),
         rentalproperty.getName(),rentalproperty.getType(),rentalproperty.getCategory(),
         rentalproperty.getArea(),rentalproperty.getRentExpected(),
         rentalproperty.getLocation(),rentalproperty.getCity(),
         rentalproperty.getSecurityDeposit()
		};
		
		
		jdbctemplate.update(insertquery, property);
		
	}

	@Override
	public void updateRentalProperty(int propertyId, double rentExpected) {
		// TODO Auto-generated method stub
           String updatequery="update rentalproperty set rentexpected=? where propertyid=?";
           Object[] values= {rentExpected,propertyId};
           
           jdbctemplate.update(updatequery, values);
           
	}

	@Override
	public void deleteRentalProperty(int propertyId) {
		// TODO Auto-generated method stub
        String deletequery = "delete from rentalproperty where propertyid=?";
        jdbctemplate.update(deletequery, propertyId);
	}

	@Override
	public RentalModel findById(int propertyId) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalModel> findByCategory(String category) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalModel> findByType(String type) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalModel> findByRentRange(double start, double end) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalModel> findByLesserDeposit(double deposit) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalModel> findByLocation(String Location) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RentalModel> findByCity(String City) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
