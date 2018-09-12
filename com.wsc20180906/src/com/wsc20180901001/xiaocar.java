package com.wsc20180901001;

public class xiaocar extends car {
	public String pp;// 这是品牌

	@Override
	public int gettype1(int days) {
		double money = 0;
		if (pp.equals("别克")) {
			money = 600 * days;
		} else if (pp.equals("宝马")) {
			money = 500 * days;
		}
		if (pp.equals("林荫大道")) {
			money = 300 * days;
		}
	
		// TODO Auto-generated method stub
		return (int) money;
	}

}
