package com.wsc2018091002;

public class Car extends Vichle {
   String brand;
   
   
	
   public Car(String brand) {
		super();
		this.brand = brand;
	}




	public double getCost(int days) {
		// TODO Auto-generated method stub
		double cost=0;
		if(brand.equals("别克")) {
			cost=600*days;
		}else if(brand.equals("宝马")) {
			cost=500*days;
		}else if(brand.equals("客车")) {
			cost=300*days;
		}
		return cost;
	}

}
