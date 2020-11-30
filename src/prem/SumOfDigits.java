package prem;

//Assignment #24
//Sub of digits from given word

public class SumOfDigits {

	void getSumOfDigits(String input) {
		int i=0;
		int sum=0;
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			boolean flag=Character.isDigit(ch);
			if(flag) {
				i = Character.getNumericValue(ch);

				sum=sum+i;
			}
		}
		System.out.println("The sum is:" +sum);
	}
	public static void main(String[] args) {
		SumOfDigits assign= new SumOfDigits();
		assign.getSumOfDigits("te1ch9kj8");

	}

}
