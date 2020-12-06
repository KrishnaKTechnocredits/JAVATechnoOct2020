package suresh;

public class StringConversion {
	
	String digit = "", lowerCase = "", upperCase = "", specialCase = "";
	
	void smallToCaps(String data) {
		
		for (int index = 0; index < data.length(); index++) {
			char ch = data.charAt(index);
			/*if (Character.isDigit(ch))
				digit += ch;
			else*/
				if (Character.isUpperCase(ch))

				upperCase += ch;

			else if (Character.isLowerCase(ch))
				lowerCase += ch;
					
			else
				specialCase += ch;
		}
		System.out.println("String Is :" + data);
		
		System.out.println("Reconstructed String is:" + upperCase.toLowerCase() + lowerCase.toUpperCase() + specialCase);
		//System.out.println("Reconstructed String old is:" + digit + upperCase + lowerCase + specialCase);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "tE1GfrEsT";
		StringConversion stringconversion = new StringConversion();
		stringconversion.smallToCaps(data);
	}

}
