package technoCredits.staticNonstatic;

public class Example8 {
	int y = 10;
	void display() {
		int z = y++ + y++ + 10; //31
		System.out.println(z); //31
		System.out.println(y); // 12
	}
	
	void display1() {
		int z = ++y + ++y + 10; //33
		System.out.println(z); //
		System.out.println(y); // 12
	}
	
	void display2() {
		int z = ++y + y++ + 10; //32
		System.out.println(z); //
		System.out.println(y); // 12
	}
	
	void display3() {
		while(y++ < 14)
			System.out.println(y); //11 12 13 14
		System.out.println("---" + y);
	}
	
	
	
	public static void main(String[] args) {
		new Example8().display3();
	}
}
