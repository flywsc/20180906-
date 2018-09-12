package com.wsc20180901008;

public class sudent2 {
	private String name;
	private String sex;
	private int age;
	private String zhaunye;

	public sudent2(String sex, String zhuanye) {
		this.sex = sex;
		zhuanye = zhuanye;
		System.out.println("我的性别是"+sex+"           专业是"+zhuanye);
	};

	public sudent2(String name, int age) {
		name = name;
		age = age;
		System.out.println("我的名字是，"+name+"     年龄是"+age+"岁");
	};

}
