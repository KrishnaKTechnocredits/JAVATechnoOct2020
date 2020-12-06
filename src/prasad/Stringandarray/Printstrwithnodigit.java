package prasad.Stringandarray;
/*Program 1: print all the words which does't have any digit.
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno*/

public class Printstrwithnodigit {
	void scanSTarray(String[]input) {
		System.out.println("Word(s) with no digits:-");
		for(int index=0;index<input.length;index++) {
			String temp = input[index];
			boolean isDigitpresent=false;
			for(int innerindex=0;innerindex<temp.length();innerindex++) {
				char ch = temp.charAt(innerindex);
				if(Character.isDigit(ch)) {
					isDigitpresent=true;
					break;
				}
			}
			if(!isDigitpresent) {
					System.out.println(temp); 
			}
		}
	}
	
	public static void main(String[]arg) {
		Printstrwithnodigit printstrwithnodigit = new Printstrwithnodigit();
		String []input = {"Masgj3Pw","credit", "r4fsjk","techno","sfjk44lk"};
		printstrwithnodigit.scanSTarray(input);
	}
	
}
