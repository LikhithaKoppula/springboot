package com.example.springjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springjdbc.model.RentalModel;
import com.example.springjdbc.service.iRentalModel;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}

	private iRentalModel rentalmodelService;

	@Autowired
	public void setRentalmodelService(iRentalModel rentalmodelService) {
		this.rentalmodelService = rentalmodelService;
	}

	
	@Override
	public void run(String... args) throws Exception
	{
		RentalModel rentalmodel= new RentalModel("2 BHK House" ,"family",102,"Independent","2 BHK","1200 sqft","Galaxy","Hyderabad",1500);
		
		rentalmodelService.addRentalProperty(rentalmodel);
		System.out.println("Property Added......");
	}
	
}
