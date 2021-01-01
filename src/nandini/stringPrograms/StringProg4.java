package nandini.stringPrograms;

public class StringProg4 {
	
	void convertUpperCaseAndLoweCase(String str) {
		for(int i = 0; i < str.length(); i++) {
			 if(Character.isUpperCase(str.charAt(i)))
			      System.out.print(Character.toLowerCase(str.charAt(i)));
			 if(Character.isLowerCase(str.charAt(i)))
			      System.out.print(Character.toUpperCase(str.charAt(i)));  
			 if(Character.isDigit(str.charAt(i)))
				  System.out.print(str.charAt(i)); 
		  }
	}
	public static void main(String args[]) {
		StringProg4 strP4 = new StringProg4 ();
		String inputStr = "tE1GfrEsT";
		strP4.convertUpperCaseAndLoweCase(inputStr);
}
}