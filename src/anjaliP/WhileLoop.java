package anjaliP;

public class WhileLoop {
	void display1(int start,int end) {
		System.out.println("-------------Even Numbers----------------");
		int index=start;
		while(index<=end) {
			if(index%2==0)
				System.out.println(index);
		index++;
		}
	}
	void display2(int start,int end) {
		System.out.println("-------------Numbers divisible by 5----------------");
		int index=start;
		while(index<=end) {
			if(index%5==0)
				System.out.println(index);
			index++;
		}
	}
	void display3(int start,int end) {
		System.out.println("-------------Numbers divisible by 3 and 5----------------");
		int index=start;
		while(index<=end) {
			if(index%5==0 && index%3==0)
				System.out.println(index);
		index++;		
		}
	}
	void diplay4(int start,int end) {
		System.out.println("-------------Numbers divisible by 7 or 13---------------");
		int index=start;
		while(index<=end) {
			if(index%7==0||index%13==0)
				System.out.println(index);
			index++;
		}
	}
	public static void main(String[] a) {
		WhileLoop whileLoop = new WhileLoop();
		whileLoop.display1(10, 15);
		whileLoop.display2(10, 30);
		whileLoop.display3(5, 18);
		whileLoop.diplay4(5,40);
	}
}
