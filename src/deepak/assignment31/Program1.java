/* Converting upper case characters into lower-case without using inbuilt functions
Given String = "TechnoCreditS"
Expected String = "technocredits"

ASCII VALUE
0 - 9 : 48 to 57
A - Z : 65 to 90
a - z : 97 to 122

 */

package deepak.assignment31;

public class Program1 {
	
	void processData(String input) {
		
		String output = "";
		
		for(int i=0; i<input.length(); i++) {
			
			int ch = input.charAt(i);
			if(ch >= 65 && ch <= 90) {
				
				char temp = (char) (ch + 32);
				output = output + temp;
			}
			else {
				output = output + input.charAt(i);
			}
		}
		System.out.println(output);
	}
	public static void main(String[] args) {
		
		String str = "TechnoCreditS";
		Program1 refVar = new Program1();
		refVar.processData(str);
	}
}
