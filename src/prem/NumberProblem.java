/*Assignment 7 : 29th Oct'2020

Write only one program having following methods. [4 methods in same program]

1. On user define range print all even numbers.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
10
12
14
=============================================================================
2. On user define range print all numbers which is divisible by 5.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
10
15
20
25
30
=============================================================================
3. On user define range print all numbers which is divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
15
=============================================================================
4. On user define range print all numbers which is divisible by 7 or 13.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
7 is divisible by 7
13 is divisible by 13
14 is divisible by 7
21 is divisible by 7
26 is divisible by 13
28 is divisible by 7
35 is divisible by 7
39 is divisible by 13
=============================================================================
*/

package prem;

public class NumberProblem {
	
	void evenNumber(int start,int end) {
		
		System.out.println("Even numbers are:");
		
		for (int index=start;index<=end;index++) {
			
			if (index%2==0)
				
				System.out.println(+index);
		}
	}
	
	
	void divisibleByFive(int startNumber,int endNumber) {
		
		System.out.println("Numbers divisible by 5 are:");
		
		for (int index=startNumber;index<=endNumber;index++) {
			
			if (index%5==0)
				
				System.out.println(+index);
		}
	}
	
	void divisibleByFiveAndThree(int startNumber,int endNumber) {
		
		System.out.println("Numbers divisible by 5 & 3 are:");

		for (int index=startNumber;index<=endNumber;index++) {
			
			if (index%5==0 && index%3==0)
				
				System.out.println(+index);
		}
	}
	
	void divisibleBySevenOrThirteen(int startNumber,int endNumber) {
		
		System.out.println("Numbers divisble by 7 or 13: ");
		
		for (int index=startNumber;index<=endNumber;index++) {
			
			if (index%7==0)
				
				System.out.println(index+" is divisible by 7");
			
			else if (index%13==0)
				
				System.out.println(index+" is divisible by 13");
			}
	}

	public static void main(String[] args) {
		
		NumberProblem numberProblem=new NumberProblem();
		numberProblem.evenNumber(10, 15);
		numberProblem.divisibleByFive(10, 30);
		numberProblem.divisibleByFiveAndThree(5,18);
		numberProblem.divisibleBySevenOrThirteen(5,40);
	}

}
