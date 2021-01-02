package technoCredits.constructor.p1;

public class BlankFinalTest2 {
	static {
		System.out.println(1);
	}
	
	{
		System.out.println(2);
	}
	
	public BlankFinalTest2() {
		this(10);
		System.out.println(3);
	}
	
	public BlankFinalTest2(int x) {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		System.out.println(4);
		BlankFinalTest2 test21 = new BlankFinalTest2();
		BlankFinalTest2 test22 = new BlankFinalTest2();
	}
}
