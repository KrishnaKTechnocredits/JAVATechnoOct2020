/*Assignment - 29 : 26th Nov'2020 
Find second maximum from array without sorting the array.*/

package anurag;

public class Assignment29 {
	
	void secondHighest(int[] ar) {
		
		int highest = ar[0];
		int secondHighest = 0;
		for(int i=0; i<ar.length; i++) {
				
			if(highest< ar[i]) {
				highest = ar[i];
				secondHighest = highest;
			} 
			else if(secondHighest<ar[i]) {
			secondHighest = ar[i];
			}
		}
		System.out.println(secondHighest);
		
	}

	public static void main(String[] args) {
		
		Assignment29 assignment29 = new Assignment29();
		int[] num = { 10, 12, 8, 20, 18, 22, 15, 13, 17 };
		assignment29.secondHighest(num);
		
	}

}
