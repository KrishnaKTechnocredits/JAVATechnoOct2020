/*Assignment - 27: 23rd Nov'2020  
Program 1: print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno */

package deepak.assignment27;

public class Program_1 {
	
	void processData(String[] input) {
		for(int i=0; i<input.length; i++) {
			boolean flag = true;
			String str = input[i];
			for(int j=0; j<str.length(); j++) {
				char ch = str.charAt(j);
				if(Character.isDigit(ch)) {
					flag = false;
					break;	
				}	
			}
			if(flag) {
				
				System.out.println(str);
			}	
		}	
	}
	
	public static void main(String[] args) {
			
		String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
		Program_1 program_1 = new Program_1();
		program_1.processData(input);
	}
}
