package com.wsc20180906;

import java.util.Scanner;

public class test_car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xiaoshou xs=new xiaoshou();
		System.out.println("欢迎光临本店，将竭诚为您服务");
		System.out.println("请问您将想看哪款车 ？1.君越    2.凯瑞");
		
		System.out.println("请输入你的选择");
		Scanner input =new Scanner(System.in);
		int shuru=input.nextInt();
		switch(shuru){
		case 1:
			xs.fangfa1();
			break;
		case 2:
			xs.fangfa2();
			break;
			default:
				System.out.println("您的输入有误，我们将介绍一款最新车型个你");
				xs.fangfa1();
		}
		
	}

}
