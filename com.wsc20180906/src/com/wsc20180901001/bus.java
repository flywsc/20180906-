package com.wsc20180901001;

import java.util.Scanner;

public class bus extends car {
    public String bb;
    public int zuowei;
	@Override
	public int gettype1(int days) {
		// TODO Auto-generated method stub
		double money=0;
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你选择的作座位数");
		zuowei=input.nextInt();
		if(zuowei<=16) {
			money=800*days;
		}else if(zuowei>16) {
			money=1500*days;
		}
		
		return (int) money;
	}
   
}
