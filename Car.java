package com.car.rent;

public class Car {
	private String carId;
	private String brand;
	private String model;
	private Double basePricePerDay;
	private boolean isAvailable;
	
	public Car(String carId,String brand,String model,Double basePricePerDay) {
		this.carId=carId;
		this.model=model;
		this.brand=brand;
		this.basePricePerDay=basePricePerDay;
		this.isAvailable=true;
		
	}
	
	public String getCarId() {
		return carId;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public Double calculatePrice(int rentalDays){
		return basePricePerDay*rentalDays;
	}
	
	public boolean isAvailabel() {
		return isAvailable;
		
	}
	
	public void rent() {
		isAvailable=false;
		
	}
	
	public void returnCar() {
		isAvailable=true;
	}

}
