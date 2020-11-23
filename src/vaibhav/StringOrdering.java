package vaibhav;

/*Program : 2 
String input = "hmPZ23i9Ws"
output = "239PZWhmis";*/

public class StringOrdering {
	
	public static void order(String order) {
		String number = "";
		String capital = "";
		String small = "";		
		for (int index = 0;index < order.length();index++) {
			char ch= order.charAt(index);
			if(Character.isDigit(ch))
				number=number+ch;
			else if(Character.isUpperCase(ch))
				capital=capital+ch;
			else if(Character.isLowerCase(ch))
				small=small+ch;		
		}		
		System.out.println("order of string "+number+capital+small);
	}

	public static void main(String[] args) {
		String given= "hmPZ23i9Ws";
		StringOrdering.order(given);
		}
}
