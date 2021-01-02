package technoCredits.constructor;

public class Test {
	String testName;
	
	Test(String name) { //3
		System.out.println("1 arg constructor"); //4
	} //5
	
	private Test(){
		System.out.println("No argument constructor");
	}
	
	public Test(String name1, String name2){
		System.out.println("2 arg constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Hi"); //1
		Test test1 = new Test("Techno"); //2 //6
		System.out.println("GM"); //7
	}
}
