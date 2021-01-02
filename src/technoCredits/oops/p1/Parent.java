package technoCredits.oops.p1;

public class Parent {
	int x = 10;
	protected int y = 20;
	public int z = 30;

	void m1() {
		System.out.println("Parent M1 Default");
	}

	protected void m2() {
		System.out.println("Parent M2 protected ");
	}
	
	public void m3() {
		System.out.println("Parent M3 Public");
	}
}
