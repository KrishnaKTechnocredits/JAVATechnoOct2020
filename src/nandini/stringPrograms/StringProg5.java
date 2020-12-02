package nandini.stringPrograms;

public class StringProg5 {

	void printwordWithoutDigit(String[] strArray) {
		for(int index = 0; index < strArray.length; index++) {
			if(!isWordWithoutDigits(strArray[index]))
				System.out.println("Word without any digits is: " + strArray[index]);
		}
	}
		boolean isWordWithoutDigits(String str){
			for(int i =0; i< str.length(); i++) {
				if(Character.isDigit(str.charAt(i)))
					 return true;
			}
			return false; 		
		}
	
	public static void main(String args[]) {
	 String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
	 StringProg5 strProg5 = new StringProg5();
	 strProg5.printwordWithoutDigit(input);
	}
}
