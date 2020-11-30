package nagendra;

/*
Create a class where you need to check given number is there in predefined array or not, if present then print frequency of the number. [Estimated time: 15 mins]

Input : Predefined array -> {10,3,9,-99,81,3,-11}
           Number to be check -> 33
Output : Given number 33 is not present in predefined array.

Input : Number to be check -> 3
output : Given number 3 is present in predefined array with frequency 2.
*/

public class NumberArray {

	void findNumber(int[] input,int numberToCheck){
		int counter=0;
		for(int i=0;i<input.length;i++){
			if(input[i]==numberToCheck){
				counter++;
			}
		}
		if(counter>0)
		System.out.println("Given number "+numberToCheck+" is present in predefined array with frequency "+counter+"");
		else
			System.out.println(" Given number "+numberToCheck+" is not present in predefined array.");		
	}
	public static void main(String[] args) {
		NumberArray number=new NumberArray();
		int input[] = { 10, 3, 9, -99, 81, 3, -11 };
		int numberToCheck = 33;
		number.findNumber(input, numberToCheck);
	}
}
