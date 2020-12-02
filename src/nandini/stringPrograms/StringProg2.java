package nandini.stringPrograms;

public class StringProg2 {
	
	void calculateConsecutiveSeqNumbers(String str) {
		String num ="";
		int sum =0;
		for(int i =0; i< str.length(); i++) {
			if(Character.isDigit(str.charAt(i)))
			num = num+str.charAt(i);
			else
			    if(!num.equals("")) {
				  sum = sum + Integer.parseInt(num);
				  num = "";
                }
			    if(i == str.length()-1 && num!="")
			    	sum = sum + Integer.parseInt(num);
		}
		System.out.println("Total Sum of Digits is: " + sum);
		
	}
	
	public static void main(String args[]) {
		StringProg2 strP2 = new StringProg2();
		String inputval = "te123ch9kj8";
		strP2.calculateConsecutiveSeqNumbers(inputval);	
	}
}
