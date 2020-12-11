/*Assignment - 24 : 22nd Nov'2020 

program 1: sum of all digits from a given string  
input: te1ch9kj8 
output:= 18*/
package suvela;

public class Assignment24 {
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
		Assignment24 assign= new Assignment24();
		assign.getSumOfDigits("te1ch9kj8");

	}

}
