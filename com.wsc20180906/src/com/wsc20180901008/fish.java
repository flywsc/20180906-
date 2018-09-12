package com.wsc20180901008;

public class fish extends animal{

	@Override
	public void info() {
		// TODO Auto-generated method stub
		this.age=2;
		this.zhonglei="鱼";
		System.out.println("我是一条5斤重的"+zhonglei);
		System.out.println("今年"+age+"岁了");
	}

}
