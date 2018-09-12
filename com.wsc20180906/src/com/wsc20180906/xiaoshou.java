package com.wsc20180906;

public class xiaoshou {
	private String name;
     public void Setname(String name) {
    	this.name="小王";
    }
	public void fangfa1() {
		System.out.println("您选择的这款车是性价比交高的一款，我将你您介绍基本情况");
		car car1=new car() ;
		car1.show1();
	}
	public void fangfa2() {
		System.out.println("您选择的这款车是性价比交高的一款，我将你您介绍基本情况");
		car2 car2=new car2() ;
		car2.show2();
	}
}
