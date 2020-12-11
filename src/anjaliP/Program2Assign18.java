package anjaliP;
/*Program : 2 
String input = "hmPZ23i9Ws"
output = "239PZWhmis";
 */
public class Program2Assign18 {
	
	static void charSorting(String order) {
		String number = "", capital = "", small = "";
		for (int index = 0;index < order.length();index++)
		{
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
			String str = ("hmPZ23i9Ws");
			System.out.println("Actual String is " + str);
			Program2Assign18.charSorting(str);
		}
	}
