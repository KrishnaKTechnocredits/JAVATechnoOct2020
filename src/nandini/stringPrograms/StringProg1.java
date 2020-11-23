package nandini.stringPrograms;

public class StringProg1 {
	
	boolean isDigit(String name){
		boolean b1= false;
		int sum =0;
	 for(int i =0 ; i<name.length(); i++){
		 char ch = name.charAt(i);
		 b1 = Character.isDigit(ch);
		 if(b1)
			  sum = sum + Character.getNumericValue(ch);
		}
		System.out.println("Sum of Digits is: " + sum);
	return b1;
	}
	
	public static void main(String args []) {
		String input = "te1ch9kj8";
		StringProg1 strP1 = new StringProg1();
		strP1.isDigit(input);
	}
}
