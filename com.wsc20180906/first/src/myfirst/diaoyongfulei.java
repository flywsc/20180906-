package myfirst;

public class diaoyongfulei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       jicheng com=new jicheng();
       jichengfulei ji=new jichengfulei();
       System.out.println(ji.sc);
       ji.st();//子类可以调用父类的方法和属性
       ji.gg();
       System.out.println(ji.dianc);//但是父类不可以调用子类
       ji.picture(); 
       com.picture();//这里可以调用个自的方法，但是如果是同一个方法的话就需要重写
	}

}
