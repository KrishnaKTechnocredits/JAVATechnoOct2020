package technoCredits.constructor.p1;

public class B extends A{
	B(){ //2
		super(10);
		System.out.println("B no-arg constructor"); //5
	} //6
	
	B(int x){
		super(x);
	}
	
	void m1() { //8
		System.out.println("B m1"); //9
	} // 10
	
	public static void main(String[] args) {
		B b1 = new B(); // 1 //7
		b1.m1(); // 8
		System.out.println("End"); //11
	}
}

