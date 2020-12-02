package milind;

public class ConvertUpperToLowerViseVersa {
	
	void convertCase(String input) {
		String reverseString = "";
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isLowerCase(ch)) {
				reverseString = reverseString + Character.toUpperCase(ch);
			}else if(Character.isUpperCase(ch)) {
				reverseString = reverseString + Character.toLowerCase(ch);
			}else{
				reverseString = reverseString + input.charAt(index);
			}
		}
		System.out.println(reverseString);
	}
	
	public static void main(String[] args) {
		String input = "tE1GfrEsT";
		ConvertUpperToLowerViseVersa convertUpperToLowerViseVersa = new ConvertUpperToLowerViseVersa();
		convertUpperToLowerViseVersa.convertCase(input);
	}

}
