package prem;

public class SumOfStringNum {

//Program 1: sum of all numbers from give string.  
//String msg = I have 15 years and 2 months of experience.
//hint : Integer.parseInt(String input) will help to convert string to int.
//you may need spilt, charAt method as well. 
		
		void sumOfNumbersInStringLine(String string) {
			String[] strArray = string.split(" ");
			int sum=0;
			for(int index=0; index<strArray.length; index++) {
				if(isNumber(strArray[index]))
					sum+=Integer.parseInt(strArray[index]);
			}
			System.out.println("Sum of numbers in string '"+string+"' is: "+sum);
		}
		
		boolean isNumber(String string) {
			for(int index=0; index<string.length();index++) {
				if(!Character.isDigit(string.charAt(index)))
					return false;
			}
			return true;
		}

		public static void main(String[] args) {
			new SumOfStringNum().sumOfNumbersInStringLine("I have 15 years and 2 months of experience.");
		}
	}

