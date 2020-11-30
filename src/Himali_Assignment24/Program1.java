package Himali_Assignment24;

public class Program1 {
	int getNumberSum(String input) {
		int sum=0;
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			
				if(Character.isDigit(ch)) {
					sum=sum+Character.getNumericValue(ch);
				}
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 program1=new Program1();
		int sumOfDights=program1.getNumberSum("te2ch9kj");
		System.out.println("Sum of each digit is " +sumOfDights);
		

	}

}
