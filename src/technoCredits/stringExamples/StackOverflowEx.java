package technoCredits.stringExamples;

public class StackOverflowEx {

	void m1() {
		System.out.println("This is m1");
		//m2();
	}
	
	void m2() {
		System.out.println("This is m2");
		m1();
	}
	
	public static void main(String[] args) {
		//new StackOverflowEx().m1();
		StackOverflowEx ex1 = null;
		for(int i=1;i<Integer.MAX_VALUE;i++) {
			System.out.println(i);
			ex1 = new StackOverflowEx();
			//ex1.m1();
		}
	}
}
