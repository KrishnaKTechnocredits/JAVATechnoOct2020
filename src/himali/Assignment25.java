package himali;
/*Assignment - 25 : 22nd Nov'2020 

Program 1: sum of all numbers from give string.  

String msg = I have 15 years and 2 months of experience.

hint : Integer.parseInt(String input) will help to convert string to int.
you may need spilt, charAt method as well. */

public class Assignment25 {

	void sumOfDigits(String msg) {
		int sum=0;
		
		String word="";
		String[] str=msg.split(" ");
		
		for(int i=0;i<str.length;i++) {
			word=str[i];
			if(isNumeric(word)) {
				sum=sum+Integer.parseInt(word);
			}
			}
				
		System.out.println("Sum of all numbers in given string line '"+msg+"' is: "+sum);
	
		}
		
		boolean isNumeric(String str) {
			for(int i=0; i<str.length();i++) {
				if(!Character.isDigit(str.charAt(i)))
					return false;
			}
			return true;
		}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment25 assign=new Assignment25();
		String msg="I have 15 years and 2 months of experience";
		
		assign.sumOfDigits(msg);
	}

}
