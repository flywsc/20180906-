package com.wsc20180906;

public class wsc20180910 {
     private int age;
     private String sex;
     public void Setsex(String sex) {
    	
    	 if(sex.equals("男")||sex.equals("女")) {
    		 this.sex=sex; 
    	 }else {
    		 System.out.println("性别非法，默认为男");
    		 this.sex="男"; 
    	 }
    	 
     }
     public void Sexage(int age) {
    	
    	 if(age<=0||age>=120) {
    		 System.out.println("年龄非法，默认为24"); 
    		 this.age=24;
    	 }else {
    		 this.age=age; 
    	 }
     }
     void show() {
    	 System.out.println("我今年"+age+"岁"+"性别是"+sex);
     }
}
