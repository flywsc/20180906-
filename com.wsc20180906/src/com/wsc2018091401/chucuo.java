package com.wsc2018091401;

import java.util.Scanner;

public class chucuo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input =new Scanner(System.in);
    
     
      try{
    	  System.out.println("请输入第一个数");
          int a1=input.nextInt();
          System.out.println("请输入第二个数");
          int a2=input.nextInt();
          System.out.println("a1+a2="+a1+a2);
      }catch(Exception e){
    	  System.out.println("你的输入可能格式不对");
    	 System.out.println( e.getMessage());
    	 System.out.println(e.getCause());
      }finally {
    	 System.out.println("运行结束");
          }
	}
      
}
