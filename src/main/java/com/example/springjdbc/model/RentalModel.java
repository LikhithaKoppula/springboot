package com.example.springjdbc.model;

public class RentalModel {
	 private String name;
	 private String category;
	 private Integer propertyId;
	 private String type;
	 private String area;
	 private String Location;
	 private String City;
	 private double rentExpected;
	 private double securityDeposit;
	 //private String bedrooms;
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public double getRentExpected() {
		return rentExpected;
	}
	public void setRentExpected(double rentExpected) {
		this.rentExpected = rentExpected;
	}
	public double getSecurityDeposit() {
		return securityDeposit;
	}
	public void setSecurityDeposit(double securityDeposit) {
		this.securityDeposit = securityDeposit;
	}
	@Override
	public String toString() {
		return "RentalModel [name=" + name + ", category=" + category + ", propertyId=" + propertyId + ", type=" + type
				+ ", area=" + area + ", Location=" + Location + ", City=" + City + ", rentExpected=" + rentExpected
				+ ", securityDeposit=" + securityDeposit + "]";
	}
	public RentalModel(String string, String string2, int i, String string3, String string4, String string5, String string6, String string7, int j) {
		super();
		// TODO Auto-generated constructor stub
	}
	public RentalModel(String name, String category, Integer propertyId, String type, String area, String location,
			String city, String string, int securityDeposit) {
		super();
		this.name = name;
		this.category = category;
		this.propertyId = propertyId;
		this.type = type;
		this.area = area;
		Location = location;
		City = city;
		//this.rentExpected = ;
		this.securityDeposit = securityDeposit;
	}
	 
}
