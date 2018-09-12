package wsc20180910;

public class dog {
	private String dg;
	private String nc;
	private String health;
	private String qm;
	private String pz;
	public dog( String dg,String nc, String health, String qm, String pz) {
		super();
		this.dg=dg;
		this.nc = nc;
		this.health = health;
		this.qm = qm;
		this.pz = pz;
	}
	public dog() {};
	
	public void show() {
		System.out.println("我的类型是："+dg+"昵称是"+nc+"健康值是："+health+"亲密度是："+qm+"品种是："+pz);
	}
	
}
