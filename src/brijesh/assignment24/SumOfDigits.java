package brijesh.assignment24;

public class SumOfDigits {
	
	void sumOfAllDigits(String string) {
		int sum=0;
		for(int index=0;index<string.length();index++) {
			if(Character.isDigit(string.charAt(index)))
					sum+=Character.getNumericValue(string.charAt(index));
		}
		System.out.println("Sum of all digits in given string "+string+"is: "+sum);
	}

	public static void main(String[] args) {
		new SumOfDigits().sumOfAllDigits("te1ch9kj8");
	}
}
