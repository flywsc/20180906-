package wsc20180910;

public class testdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         dog dogs=new dog("狗","小小","80","20","小奶狗");
         penguin pe=new  penguin("企鹅","拉拉","70","65","男");
         pe.setjk("92");//这是用set来设置的健康值
         dogs.show();
         pe.show();
	}

}
