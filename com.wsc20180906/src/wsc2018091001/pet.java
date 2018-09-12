package wsc2018091001;

public abstract class  pet {
	String name;
	int health;
	int love;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = "企鹅";
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public abstract void  print() ;
}
