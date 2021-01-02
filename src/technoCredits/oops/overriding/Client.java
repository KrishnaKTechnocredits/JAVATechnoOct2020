package technoCredits.oops.overriding;

public class Client {

	public static void main(String[] args) {
		A a1 = new B();
		a1.findOverriden();
		//B.findOverriden();
	}
}
