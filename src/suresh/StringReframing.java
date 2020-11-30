package suresh;

/*String input = "hmPZ23i9Ws"
output = "239PZWhmis";*/
public class StringReframing {
	String digit = "", lowerCase = "", upperCase = "", specialCase = "";

	void stringDisplay(String data) {
		for (int index = 0; index < data.length(); index++) {
			char ch = data.charAt(index);
			if (Character.isDigit(ch))
				digit += ch;

			else if (Character.isLowerCase(ch))
				lowerCase += ch;

			else if (Character.isUpperCase(ch))

				upperCase += ch;

			else
				specialCase += ch;
		}
		System.out.println("String Is :" + data);
		System.out.println("Reconstructed String is:" + digit + upperCase + lowerCase + specialCase);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "hmPZ23i9Ws";
		StringReframing stringframe = new StringReframing();
		stringframe.stringDisplay(data);
	}

}
