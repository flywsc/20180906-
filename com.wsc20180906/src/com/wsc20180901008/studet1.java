package com.wsc20180901008;

public class studet1 {
	public String name;
	public int age;
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<16) {
			System.out.println("您的岁数小于16");
		}else {
			System.out.println("您的岁数大于16");
			
		}
		this.age = age;
	}

	
}
