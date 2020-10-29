/*//Write only one program having following methods. [4 methods in same program]
//1. On user define range print all even numbers.
//Hint : pass start and end index as a parameter.Input : Range -> 10 to 15  Output : Even numbers are: 10 12 14

//2. On user define range print all numbers which is divisible by 5.
//Hint : pass start and end index as a parameter.
//Input : Range -> 10 to 30
//Output : Divisible by 5, numbers are:
//10 15 20 25 30

//3. On user define range print all numbers which is divisible by 5 and divisible by 3.
//Hint : pass start and end index as a parameter.
//Input : Range -> 5 to 18
//Output : Divisible by 5 & 3, numbers are:15

//4. On user define range print all numbers which is divisible by 7 or 13.
//Hint : pass start and end index as a parameter.
//Input : Range -> 5 to 40
//Output : Divisible by 7 or 13, numbers are:
//7 is divisible by 7
//13 is divisible by 13
//14 is divisible by 7
//21 is divisible by 7
//26 is divisible by 13
//28 is divisible by 7
//35 is divisible by 7
//39 is divisible by 13
*/
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
