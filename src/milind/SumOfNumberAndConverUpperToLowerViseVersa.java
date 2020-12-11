package milind;

public class SumOfNumberAndConverUpperToLowerViseVersa {
	
	void sumAndConverUperToLowerUsingASCII(String input){
		String lowerCase = "";
		int sum = 0;
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int tempNumber = ch;
			if(tempNumber >= 65 && tempNumber <= 90) {
				char ch1 = (char)(tempNumber+32); 
				lowerCase = lowerCase + ch1;
			}if(tempNumber >= 97 && tempNumber <= 122) {
				char ch1 = (char)(tempNumber-32);
				lowerCase = lowerCase + ch1;
			}if(tempNumber >= 48 && tempNumber <= 57) {
				sum = sum + Character.getNumericValue(input.charAt(index));
			}
		}
		System.out.println("Output " + sum + lowerCase);
	}
	
	public static void main(String[] args) {
		String input = "Te1ch8n9oC6reDi5TS1";
		SumOfNumberAndConverUpperToLowerViseVersa sumOfNumberAndConverUpperToLowerViseVersa = new SumOfNumberAndConverUpperToLowerViseVersa();
		sumOfNumberAndConverUpperToLowerViseVersa.sumAndConverUperToLowerUsingASCII(input);
	}

}
