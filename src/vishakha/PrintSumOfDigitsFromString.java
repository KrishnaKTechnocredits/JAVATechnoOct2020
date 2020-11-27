/*sum of all digits from a given string  
input: te1ch9kj8 
output:= 18*/

package vishakha;

public class PrintSumOfDigitsFromString {
	
	void printSumOfDigits(String str){
		int sum =0;
		for(int i=0; i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum is "+sum);
	}
	
	public static void main(String[] args) {
		String str = "te1ch9kj8" ;
		new PrintSumOfDigitsFromString().printSumOfDigits(str);
	}
}
