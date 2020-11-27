package milind;

public class StringSortingOnNumberUpperLowerCase {
	
	void stringSorting(String input) {
		String digit = "", upperCase = "", lowerCase = "", specialChar = "";
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				digit = digit + input.charAt(index);
			} else if(Character.isUpperCase(ch)) {
				upperCase = upperCase + input.charAt(index);
			}else if(Character.isLowerCase(ch)) {
				lowerCase = lowerCase + input.charAt(index);
			}else {
				specialChar = specialChar + input.charAt(index);
			}
		}
		System.out.println("Sorted string is : " + digit + upperCase + lowerCase + specialChar);
	}
	
	public static void main(String[] args) {
		String input = "@hmPZ2#3i&9Ws$";
		StringSortingOnNumberUpperLowerCase stringSortingOnNumberUpperLowerCase = new StringSortingOnNumberUpperLowerCase();
		stringSortingOnNumberUpperLowerCase.stringSorting(input);
	} 

}
