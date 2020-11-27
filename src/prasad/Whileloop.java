package prasad;

public class Whileloop {
	void evennumber() {
		int index=10;
		while(index<=15) {
			if(index%2==0)
				System.out.println(index);
			index++;
		}
	}
	
	void divisibleby5(int number1,int number2) {
		int start = number1;
		int end = number2;
		while(start<=end) {
			if(start%5==0) 
				System.out.println(start);
			start++;
		}
	}
		void divisibleby5and3(int number1,int number2) {
			int start = number1;
			int end = number2;
			while(start<=end) {
				if(start%5==0 && start%3==0)
					System.out.println(start);
				start++;
			}
	 }
		
		void divisibleby7or13(int number1,int number2) {
			int start = number1;
			int end = number2;
			while(start<=end) {
				if(start%7==0)
					System.out.println(start + " is divisible by 7");
				else if(start%13==0)
					System.out.println(start + " is divisible by 13");
				start++;
			}
	}
	public static void main(String[]arg) {
		Whileloop whileloop = new Whileloop();
		System.out.println("> Even numbers are: ");
		whileloop.evennumber();
		System.out.println("> Numbers divisible by 5");
		whileloop.divisibleby5(10,30);
		System.out.println("> Numbers divisible by 5 and 3");
		whileloop.divisibleby5and3(10,30);
		System.out.println("> Numbers divisible by 7 or 13");
		whileloop.divisibleby7or13(5,40);
	}
}
