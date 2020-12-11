package milind;

public class ConvertUpperIntoLowerCaseASCII {
	
	void converUperToLowerUsingASCII(String input) {
		String lowerCase = "";
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int tempNumber = ch;
			if(tempNumber >= 65 && tempNumber <= 90) {
				char ch1 = (char)(tempNumber+32); 
				lowerCase = lowerCase + ch1;
			}if(tempNumber >= 97 && tempNumber <= 122) {
			lowerCase = lowerCase + ch;
			}
		}
		System.out.println("Lower case " + lowerCase);
	}
	
	public static void main(String[] args) {
		String input = "TechnoCreditS";
		ConvertUpperIntoLowerCaseASCII convertUpperIntoLowerCaseASCII = new ConvertUpperIntoLowerCaseASCII();
		convertUpperIntoLowerCaseASCII.converUperToLowerUsingASCII(input);
	}

}
