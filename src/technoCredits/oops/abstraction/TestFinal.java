package technoCredits.oops.abstraction;

public class TestFinal {
	final int rno;
	final String name;
	
	{
		this.rno = 1;
		this.name = "fdkjfa";
		System.out.println(rno);
		System.out.println(name);
	}
	
	
	TestFinal(int rno, String name){
		System.out.println(1);
	}
	
	TestFinal(){
		System.out.println(2);
	}
	
	TestFinal(boolean b){
		System.out.println(3);
	}
	
	public static void main(String[] args) {
		
		TestFinal testFinal = new TestFinal();
		
	}
	

	{
		System.out.println("Techno");
	}
}
