package technoCredits;

public class Test3{
	int x = 10;
	void display() {
		System.out.println("This is display");
	}
	
	public static void main(String[] args) {
		int x = 10;
		Test3 test3 = new Test3();
		System.out.println(test3);
		//System.out.println(x);
		
		String msg1 = "Technocredits";
		String msg2 = "Hello";
		//String temp = msg1;
		//msg1 = msg2;
		//msg2 = temp;
		
		System.out.println(msg1.substring(0,msg1.length()));
		//System.out.println(msg1.substring(3,6));
		//System.out.println(msg1 + "" + msg2);
			
	}
}
