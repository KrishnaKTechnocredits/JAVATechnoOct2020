//Assignment - 35 : 4th Dec'2020 
//Return sum of all Armstrong number from given array.
//input : [153, 111, 124, 371]//// output : 524

package priya;

public class SumOfAllArmstrongInArray {

	int sumofArmstrong(int array[]) {
		int sum =0;
		for(int index=0; index<array.length; index++) {
			int number, remainder, result= 0;
	        number = array[index];
	        while (number != 0)
	        {
	            remainder = number % 10;
	            result += Math.pow(remainder, 3);
	            number =  number/10;
	        }
	        if(result == array[index])
	            sum = sum + result;
		}
		return sum;
	}
	public static void main(String args[]) {
		int [] input = {153, 111, 124, 371};
		SumOfAllArmstrongInArray sumofarmstrongno = new SumOfAllArmstrongInArray();
		int armstrongNoSum = sumofarmstrongno.sumofArmstrong(input);
		System.out.println("Sum of Armstrong numbers from the given array is: " + armstrongNoSum);
	}
	
}
