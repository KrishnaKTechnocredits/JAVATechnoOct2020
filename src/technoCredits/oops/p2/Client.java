package technoCredits.oops.p2;
import technoCredits.oops.p1.Test;

public class Client extends Test{
	
	public void m1() {
		System.out.println("Client");
	}
	
	public static void main(String[] args) {
		Test t1 = new Client();
		// t1.m1(); // CE
	}
	
	
}
