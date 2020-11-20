package technoCredits.staticNonstatic;

public class Example4 {

	void m1(){
		m4();
		System.out.println("M1");
	}
	
	static void m2(){
		m3(); //2 
		System.out.println("M2"); //4
	}
	
	static void m3(){
		System.out.println("M3"); //3
	}
	
	void m4(){
		System.out.println("M4");
	}
	
	public static void main(String[] args) {
		Example4 ex4 = new Example4();
		ex4.m2(); //1 //5
	}
}
