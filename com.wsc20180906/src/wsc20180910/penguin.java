package wsc20180910;

public class penguin {
    public static final String sex_x="雄";
    public static final String sex_c="雌";
	private String pe;
	private String nc;
    private String jk;
    private String qm;
    private String xb;
	public penguin( String pe,String nc, String jk, String qm, String xb) {
		super();
		this.pe=pe;
		this.nc = nc;
		this.jk = jk;
		this.qm = qm;
		this.xb = xb;
	}
    public void setjk(String jk) {
    	this.jk=jk;
    }
    
	public penguin() {};
    public void show() {
		System.out.println("我的类型是："+pe+"\t昵称是"+nc+"健康值是："+jk+"亲密度是："+qm+"品种是："+xb);
	}
}
