package com.wsc201809012;

public class dog extends pet {


	public void play() {
		// TODO Auto-generated method stub
		this.love=50;
		System.out.println("去散散步");
	}

	
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("狗狗与主人玩接飞盘游戏");
		System.out.println("亲密度+5");
		System.out.println("健康值-6");
	}

}
