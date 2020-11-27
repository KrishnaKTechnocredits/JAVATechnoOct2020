package prasad.Stringandarray;

/*program 1: sum of all digits from a given string
input: te1ch9kj8
output:= 18*/

public class Sumofdigitsfrstr {
	
	int scanst(String word) {
		int sum=0;
		for(int index=0;index<word.length();index++) {
			char ch = word.charAt(index);
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum=sum+num;
			}	
		}
		
		return sum;	 
	}

	public static void main(String[]arg) {
		Sumofdigitsfrstr sumofdigitsfrstr = new Sumofdigitsfrstr();
		String word= "te1ch9kj8";
		int sum = sumofdigitsfrstr.scanst(word);
		System.out.println("Sum of all digits in given string " + word+ " = "+ sum );
	}
}
