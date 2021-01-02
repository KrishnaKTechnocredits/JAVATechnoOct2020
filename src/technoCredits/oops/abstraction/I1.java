package technoCredits.oops.abstraction;

public interface I1 {
	int x = 0;
	
	void m1();
	void m2();
	void m3();
	void m4();
	abstract void m5();
	
	default void m6() {
		System.out.println("");
	}
	
	public static void m7() {
		System.out.println("Parent M7");
	}
}
