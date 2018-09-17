package com.wsc2018091704;

import java.util.ArrayList;
import java.util.Iterator;

import com.wsc2018091701.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//这里是普通赋值，但是需要强制转换
		pin pi=new pin("a1","男");
        pin p2=new pin("a2","女");
        pin p3=new pin("a3","男");
        pin p4=new pin("a4","女");
        pin p5=new pin("a5","男");
        pin p6=new pin("a6","男");
        ArrayList pins = new ArrayList();
        pins.add(pi);
        pins.add(p2);
        pins.add(p3);
        pins.add(p4);
        pins.add(p5);
        pins.add(p6);
       
        System.out.println("长度是"+pins.size());
        Iterator it=pins.iterator();
        while(it.hasNext()) {
        	
        	pin pinss=(pin)it.next();//这里要加括号来强制转化
        	System.out.println("我的编号是"+pinss.getName()+"性别是"+pinss.getSex());
        }

	}

	

}
