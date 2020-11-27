package nandini.stringPrograms;

public class StringProg3 {

	void sumOfNumbers(String str) {
		int sum =0;
		String num ="";
		String word = "";
		String [] strArray = str.split(" ");
		for (int index = 0; index < strArray.length; index++) {
			 word= strArray[index];
			 for(int i =0; i< word.length(); i++) {
					if(Character.isDigit(word.charAt(i)))
					num = num+word.charAt(i);
					else
					    if(!num.equals("")) {
						  sum = sum + Integer.parseInt(num);
						  num = "";			    
						  }
				}
		   }
		System.out.println("Total Sum of Digits is: " + sum);
	}
	
 public static void main(String args[]) {
    StringProg3 strP3 = new StringProg3();
	String msg = "I have 15 years and 2 months of experience";
	strP3.sumOfNumbers(msg);
 }
}



