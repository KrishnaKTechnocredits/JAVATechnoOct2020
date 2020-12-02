/*Program 1: print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno*/


package vishakha;

public class Asgnmt27_PrintWordWithNoDigit {
	
	void printWordWithNoDigit(String[] input){
		for(int i=0; i<input.length; i++){
			String word = input[i];
			boolean flag = true;
			for(int j=0; j<word.length(); j++){
				char ch = word.charAt(j);
				if(Character.isDigit(ch)){
					flag = false;
				}
			}
			if(flag)
				System.out.println(word);
		}
	}

	public static void main(String[] args) {
		String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
		new Asgnmt27_PrintWordWithNoDigit().printWordWithNoDigit(input);
	}
}
