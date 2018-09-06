package myfirst;

public class cook {
	String name;
     public cook() {

    	  name="jack";
      }
	void cut() {
		System.out.println(name + "切辣椒");
	}
	void ve() {
		System.out.println(name+"洗蔬菜");
	}
	void cook(String dish) {
		cut();
		ve();
		System.out.println(name+"开始做菜"+dish);
	}
}
