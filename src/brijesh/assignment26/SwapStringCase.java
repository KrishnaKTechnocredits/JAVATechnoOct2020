package brijesh.assignment26;

public class SwapStringCase {
	
	public void swapCaseOfString(String string) {
		String updatedString="";
		for(int index=0; index<string.length(); index++) {
			if(Character.isUpperCase(string.charAt(index)))
				updatedString += Character.toLowerCase(string.charAt(index));
			else if(Character.isLowerCase(string.charAt(index)))
				updatedString += Character.toUpperCase(string.charAt(index));
			else
				updatedString += string.charAt(index);
		}
		System.out.println("Given String: "+string+"\nUpdated String: "+updatedString);
	}

	public static void main(String[] args) {
		new SwapStringCase().swapCaseOfString("tE1GfrEsT");
	}
}
