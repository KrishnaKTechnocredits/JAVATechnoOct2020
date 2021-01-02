package technoCredits.oops.p2;

public interface Parent1 {
	default void m1() {
		System.out.println("Parent m1");
	}
	
	static void m2() {
		System.out.println("Parent m2");
	}
}
