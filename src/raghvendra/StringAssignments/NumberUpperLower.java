package raghvendra.StringAssignments;
/*Program : 2 
String input = "hmPZ23i9Ws"
output = "239PZWhmis";*/

public class NumberUpperLower {
	String set;
	void transfromString(String st) {
		String digit="",capital="",lower="";
		for(int index=0;index<st.length();index++) {
			char ch=st.charAt(index);
			if(Character.isDigit(ch))
				digit+=ch;
			else if (Character.isUpperCase(ch))
				capital+=ch;
			else if (Character.isLowerCase(ch))
				lower+=ch;
		}
		System.out.println("New String: "+digit+capital+lower);
	}
	public static void main(String[] args) {
		NumberUpperLower numberUpperLower=new NumberUpperLower();
		String st="hmPZ23i9Ws";
		numberUpperLower.transfromString(st);
	}
}
