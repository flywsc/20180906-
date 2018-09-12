package com.wsc20180906;

public class congzai {
	public int foot(int a, int b) {
		System.out.println(a + b);
		return b + a;
	}

	public static double foot(double a, double b) {
		return a;
	}

	public static double foot(int b, double a) {//这个是指比较里面的数据类型
		return a;
	}

	public static double foot(double a, double b, double c) {
		return c;
	}

	public final  static int aa(int a ,int b) {
		System.out.println(a+b);
		a=1;
		b=2;//如果这里定义了，那么后面的定义就无效了
		return a+b;
	}

	// 方法名必须相同
	// 重构必须是参数个数不一样，参数类型不一样，参数排序不一样
	// 无关返回值与权限修饰符
	public static void main(String[] args) {
		System.out.println(foot(0.3, 0.2));// 调用double方法
		System.out.println(foot(3, 0.2));
		System.out.println(foot(0.1, 0.1, 0.1));
		System.out.println(aa(1,25));//这里传递参数进去无效
	}
}