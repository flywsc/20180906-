package com.wsc2018091401;

public class age {
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception{
		if(age<1||age>100) {
			throw new Exception("年龄必须在1-100之间");
		}else {
			this.age = age;
		}
		
	}

	public age(int age) {
		super();
		this.age = age;
	}

	public age() {
		super();
		// TODO Auto-generated constructor stub
	}
}
