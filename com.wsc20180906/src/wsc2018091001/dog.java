package wsc2018091001;

public  class  dog extends pet {
	String pz;


	public void setPz(String pz) {
		this.pz = "狗";
	}
    
	public void print() {
		System.out.println("我是一只" + pz);
	}
}
