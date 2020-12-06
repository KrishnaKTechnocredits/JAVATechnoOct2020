package nandini;

public class SumOfArmstrongNo {
	
	int sumofArmstrong(int arr[]) {
		int sum =0;
		for(int i=0; i<arr.length; i++) {
			int number, remainder, result= 0;
	        number = arr[i];
	        while (number != 0)
	        {
	            remainder = number % 10;
	            result += Math.pow(remainder, 3);
	            number =  number/10;
	        }
	        if(result == arr[i])
	            sum = sum + result;
		}
		return sum;
	}
	public static void main(String args[]) {
		int [] input = {153, 111, 124, 371};
		SumOfArmstrongNo armstrongNo = new SumOfArmstrongNo();
		int armstrongNoSum = armstrongNo.sumofArmstrong(input);
		System.out.println("Sum of Armstrong Numbers is: " + armstrongNoSum);
	}
}
