package com.wsc2018091701;

import java.util.ArrayList;
import java.util.List;

public class pin {

	public static void main(String[] args) {

		puns p1 = new puns("001", "男");
		puns p2 = new puns("002", "男");
		puns p3 = new puns("003", "男");
		puns p4 = new puns("004", "男");
		ArrayList pins = new ArrayList();
		pins.add(p1);
		pins.add(p2);
		pins.add(p3);
		pins.add(p4);
		pins.add(2, p2);
		System.out.println("共有" + pins.size() + "只狗");
		System.out.println("分别是：");
		for (int i = 0; i < pins.size(); i++) {
			pin pi = (pin) pins.get(i);
			
		}

	}

	
}
