package ankita.assignment.staticExample;

public class D {
	static void m6() {
		System.out.println("Class D->M6   :Call from static to static :M6 -> M7 ");
		D.m7();
	}
	static void m7() {
		System.out.println("Class D->M7   :In Static method M7");
	}
}
