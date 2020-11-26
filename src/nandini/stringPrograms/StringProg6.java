package nandini.stringPrograms;

public class StringProg6 {
  
	void words(String[] inputArr) {
		for(int index=0; index< inputArr.length; index++) {
	     if(sumofDigits(inputArr[index]) > 10)
	    	 System.out.println("Word who's sum is greater than 10 is: " +inputArr[index]);
		}	
	}
	
	int sumofDigits(String word) {
		int sum =0;
		for(int i =0; i < word.length(); i++) {
			if(Character.isDigit(word.charAt(i)))
				sum = sum + Character.getNumericValue(word.charAt(i));	
		}
		return sum;
	}
	
	public static void main(String args[]) {
		String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
		StringProg6 strP6 = new StringProg6();
		strP6.words(input);
	}
}
