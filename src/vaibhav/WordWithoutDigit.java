package vaibhav;


/*Program 1: print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno*/


public class WordWithoutDigit {
	
	public static void getWord(String []input) {
		for(int index = 0; index < input.length ; index++) {
			boolean flag = false;
			String str = input[index];
			for(int innerIndex = 0; innerIndex < str.length() ; innerIndex++) {
				if(Character.isDigit(str.charAt(innerIndex))) {
					flag = true;
					break;					
				}
			}
			if (!flag)
				System.out.println("String without any digit is "+str);
		}	
	}

	public static void main(String[] args) {
		String [] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
		WordWithoutDigit.getWord(input);

	}

}
