package com.wsc2018091401;

import java.util.InputMismatchException;
import java.util.Scanner;

public class buhuoyichang {
  public static void main(String[] args) {
	Scanner input =new Scanner (System.in);
    try {
    	System.out.println("请输入1-3任意数字查看课程");
    	int a=input.nextInt();
    	
    	switch(a){
    	case 1:
    		System.out.println("java语言基础");
    		break;
    	case 2:
    		System.out.println("c语言");
    		break;
    	case 3:
    		System.out.println("html");
    		break;
    	}
    	
    }catch(InputMismatchException e) {
    	
    	System.err.println("你的输入数据类型可能有错误");
    	//e.printStackTrace();//抛出异常
    	System.exit(1);
    	}catch (Exception a){
       System.out.println("你的输入格式可能有错误");
       System.out.println("我们将自动默认输入1");
       
    }finally {
    	System.out.println("欢迎提出建议........");
    	System.out.println("运行结束");
    }	
}
}
