package com.wsc2018091002;

public class test {

	public static void main(String[] args) {
		
        Vichle[] vichles=new Vichle[4];
        
        Vichle vichle=new Car("宝马");
        vichles[0]=vichle;
        
        Vichle vichle1=new Car("宝马");
        vichles[1]=vichle1;
        
        Vichle vichle2=new Bus(34);
        vichles[2]=vichle2;
        
        Vichle vichle3=new Car("别克");
        vichles[3]=vichle3;
        
        customer cus=new customer();
        System.out.println("您租车的价钱是:"+cus.CountTotal(vichles));
        
	}

}
