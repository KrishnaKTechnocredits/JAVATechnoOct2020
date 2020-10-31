package prasad;

public class Divisibility {
	
	void evennumbers(int start,int end) {
		for(int index=start;index<=end;index++) {
			if(index%2==0)
				System.out.println(index);
		}
		
	}
	
	void divisibleby5(int start,int end) {
		for(int index=start;index<=end;index++) {
			if(index%5==0)
				System.out.println(index);
		}
			
	}
	
	void divisibleby5and3(int start,int end){
		for(int index=start;index<=end;index++) {
			if(index%5==0 && index%3==0)
				System.out.println(index);
		}
		
	}
	void divisibleby7or13(int start,int end) {
		for(int index=start;index<=end;index++) {
			if(index%7==0)
				System.out.println(index + " is divisible by 7");
			else if (index%13==0)
				System.out.println(index + " is divisible by 13");
		}
		
	}

	public static void main(String[] arg) {
		Divisibility divisibility = new Divisibility();
		System.out.println("> Even numbers are: ");
		divisibility.evennumbers(10,15);
		System.out.println("> Numbers Divisible by 5: ");
		divisibility.divisibleby5(10,30);
		System.out.println("> Numbers Divisible by 5 & 3: ");
		divisibility.divisibleby5and3(5,18);
		System.out.println("> Numbers Divisible by 7 0r 13: ");
		divisibility.divisibleby7or13(5,40);
	}
}