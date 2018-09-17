package com.wsc2018091401;

import java.util.Scanner;

public class testage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("请输入年龄");
       Scanner input =new Scanner (System.in);
		int a=input.nextInt();
		age ag=new age(a);
		try {
			ag.setAge(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("程序结束");
		}
	}

}
