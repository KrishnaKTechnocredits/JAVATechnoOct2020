
package ruby;

class CheckNumber{
	void displayEvenNumber(int start, int end){
		System.out.println("Even Number between "+start+" and "+end);
		for(int index=start;index < end;index++){
			if(index%2==0)
				System.out.println(index);
		}
	}
	
	void displayDivisible5(int start, int end){
		System.out.println("Number divisible by 5 between "+start+" and "+end);
		for(int index=start;index < end; index++){
			if(index%5 == 0)
				System.out.println(index);
		}
	}
	
	void displayDivisible3And5(int start, int end){
		System.out.println("Number divisible by 3 and 5 between "+start+" and "+end);
		for(int index=start;index < end;index++){
			if(index%5==0 && index%3 ==0)
				System.out.println("Divisible by 5 & 3, number: " + index);
		}
	}
	
	void displayDivisible7or13(int start, int end){
		System.out.println("Number divisible by 7 or 13 between "+start+" and "+end);
			for(int index=start;index < end;index++){
				if(index%7==0)
					System.out.println(index+" is divisible by 7");
				else if(index%13==0)
					System.out.println(index+" is divisible by 13");
			}
	}

	public static void main(String[] a){
		CheckNumber checkNumber = new CheckNumber();
		checkNumber.displayEvenNumber(10,15);
		checkNumber.displayDivisible5(10,30);
		checkNumber.displayDivisible3And5(5,18);
		checkNumber.displayDivisible7or13(5,40);
	}
}
