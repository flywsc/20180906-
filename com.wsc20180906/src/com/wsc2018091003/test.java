package com.wsc2018091003;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vichle[]  vichles= new Vichle[4];
		vichles[0]=new Car("宝马");
		vichles[1]=new Car("别克");
		vichles[2]=new Bus(34);
		vichles[3]=new Car("宝马");
		 
		customer cu=new customer();
		System.out.println("您租车的总金额为"+cu.CountTotal(vichles));
	}

}
