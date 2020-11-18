/* Program : 2 
String input = "hmPZ23i9Ws"
output = "239PZWhmis";
*/
package suvela;

public class Asgmt18_2 {
	
	void order(String input) {
		String digit="";
		String uppercase="";
		String lowercase="";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) 
				digit= digit+ch;
			if (Character.isUpperCase(ch))
				uppercase= uppercase+ ch;
			if (Character.isLowerCase(ch))
				lowercase= lowercase+ch;
		}
		System.out.println("Orderwise string: "  +digit+uppercase+lowercase);
	}
	
	public static void main(String[] args) {
		String input = "hmPZ23i9Ws";
		Asgmt18_2 assign = new Asgmt18_2();
		assign.order(input);
		
	}

}
