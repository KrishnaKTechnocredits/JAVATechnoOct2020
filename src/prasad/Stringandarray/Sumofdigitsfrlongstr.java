package prasad.Stringandarray;

/*Assignment - 25 : 22nd Nov'2020

Program 1: sum of all numbers from give string.

String msg = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well.*/

public class Sumofdigitsfrlongstr {
	
	int sumOfDigits(String text) {
		int sum=0;
		String temp="";
		for(int index=0;index<text.length();index++) {
			if(Character.isDigit(text.charAt(index))) {
				temp = temp+text.charAt(index);
			}
			else if(Character.isLetter(text.charAt(index))) {
				if(temp.length()>0) {
					sum=sum+Integer.parseInt(temp);;
					temp="";
				}
			}
		}
		if(temp.length()>0) {
			sum=sum+Integer.parseInt(temp);
		}
	
		return sum;
	}
	
	public static void main(String[]arg) {
		Sumofdigitsfrlongstr sumofdigitsfrlongstr = new Sumofdigitsfrlongstr();
		String msg = "I have 15 years and 2 months of experience";
		int sum = sumofdigitsfrlongstr.sumOfDigits(msg);
		System.out.println("Sum of all digits in given msg: " + msg + " : "+ sum);
	}
}

