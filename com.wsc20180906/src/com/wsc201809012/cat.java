package com.wsc201809012;

public class cat extends pet {

	@Override
	public void play() {
		// TODO Auto-generated method stub
        this.love=70;
        System.out.println("在家陪它玩");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("小猫与主人玩捉迷藏游戏");
		System.out.println("亲密度+6");
		System.out.println("健康值-4");
	}

}
