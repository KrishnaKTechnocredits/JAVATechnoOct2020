package technoCredits.oops.overriding;

public class Y extends X{
	int deptId = 10;
	
	void m1() {
		aa = 100;
		deptId = 100;
	}
	
	public static void main(String[] args) {
		Y y1 = new Y();
		y1.m1();
		y1.display(); //100
		
		X x1 = new X();
		x1.display(); // 10
		
		X xy = new Y();
		System.out.println(xy.aa); //10
	}
	
}
