package com.wsc2018091703;

public class pets {
	public String name;
	public String sex;

	public pets(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	public pets() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public void print() {
		System.out.println("我叫"+name+"性别是"+sex);
	}

}
