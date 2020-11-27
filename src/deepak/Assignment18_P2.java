/* String input = "hmPZ23i9Ws"
output = "239PZWhmis"; */


package deepak;

public class Assignment18_P2 {
	
	String number = "";
	String capital= "";
	String small = "";
	
	void processData(String input) {
				
		for( int index=0; index < input.length(); index++) {
			
			char ch = input.charAt(index);
			
			if(Character.isDigit(ch))
				number = number + ch;
			
			else if(Character.isUpperCase(ch))
				capital = capital + ch;
				
			else if(Character.isLowerCase(ch))
				small = small + ch;
		}
		
		System.out.println(number + capital + small);
		
	}

	public static void main(String[] args) {
		
		String input = "hmPZ23i9Ws";
		Assignment18_P2 assignment18_P2 = new Assignment18_P2();
		assignment18_P2.processData(input);

	}

}
