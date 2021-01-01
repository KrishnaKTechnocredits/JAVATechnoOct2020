/*
 *Program 1:  return true if UpperCase characters count are more than lowercase else return false.
 *input : TechnoCrediTS
 *output : false
 */

package deepak.assignment32;

public class Program1 {
	
	boolean processData1(String input) {
		
		int upperCaseCount=0;
		int lowerCaseCount=0;
		
		for(int i=0; i<input.length(); i++) {
			
			char ch = input.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				upperCaseCount++;
			}
			else if(Character.isLowerCase(ch)) {
				lowerCaseCount++;
			}
		}
		
		if(upperCaseCount > lowerCaseCount) {
			return true;
		}
		else
			return false;
	}
	
	boolean processData2(String input) {
		
		int upperCaseCount=0;
		int lowerCaseCount=0;

		for(int i=0; i<input.length(); i++) {
			int ch = input.charAt(i);
			
			if(ch >= 65 && ch <= 90) {
				upperCaseCount++;
			}
			
			else if(ch >= 97 && ch <= 122) {
				lowerCaseCount++;	
			}
		}
		if(upperCaseCount > lowerCaseCount) {
			
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		String str = "TechnoCrediTS";
		Program1 refVar = new Program1();
		System.out.println("Calling Process Data 1 method : "+ refVar.processData1(str));
		System.out.println("Calling Process Data 2 method : "+ refVar.processData2(str));
	}
}
