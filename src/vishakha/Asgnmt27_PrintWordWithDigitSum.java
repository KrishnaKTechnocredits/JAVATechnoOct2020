/*Program 2: print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9*/


package vishakha;

public class Asgnmt27_PrintWordWithDigitSum {
	
	void printSumofDigits(String[] input){
		for(int i=0; i<input.length; i++){
			String word = input[i];
			int sum = 0;
			for(int j=0; j<word.length(); j++){
				char ch = word.charAt(j);
				if(Character.isDigit(ch)){
					sum += Character.getNumericValue(ch) ;
				}
			}
			if(sum > 10)
				System.out.println(word);
		}
	}

	public static void main(String[] args) {
		String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
		new Asgnmt27_PrintWordWithDigitSum().printSumofDigits(input);
	}
}
