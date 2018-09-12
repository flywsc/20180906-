package com.wsc20180901008;

public class bird  extends animal{

	@Override
	public void info() {
		// TODO Auto-generated method stub
		this.age=4;
		this.zhonglei="鸟";
		System.out.println("我是一只红色的"+zhonglei);
		System.out.println("今年"+age+"岁了");
	}

}
