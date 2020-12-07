package vaibhav.assignment_35;

/*Assignment - 35 : 4th Dec'2020 

return sum of all Armstrong number from given array.
input : [153, 111, 124, 371]
output : 524*/


public class SumOfArmstrong {	
	public static void getSumOfArmstrong(int[] palidromeArray) {
		int finalSum = 0 ;
		for (int i = 0 ; i < palidromeArray.length;i++) {
			int temp = 0;
			int num = palidromeArray[i];
			int original = num;
			int sum = 0;
			while (num > 0) {
				temp = num % 10;
				sum += (temp * temp * temp);				
				num = num/10;
			}
			if (sum == original)
				finalSum += original;			
		}	
		System.out.println("Sum of Armstrong "+finalSum);
	}
	public static void main(String[] args) {
		int [] palidromeArray = {153, 111, 124, 371};
		SumOfArmstrong.getSumOfArmstrong(palidromeArray);
	}
}
