package nagendra.string;

/*Program 1: print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno
*/
public class PrintWordsWithoutDigit {
	
	void wordsWithoutDigit(String[] words){
		
		for(int index=0;index<words.length;index++){
			boolean flag=true;
			for(int inner=0;inner <words[index].length();inner++){
				if(Character.isDigit(words[index].charAt(inner))){
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println(" Word Without Digit is -> "+words[index]);
		}
	}

	public static void main(String[] args) {
		
		PrintWordsWithoutDigit object=new PrintWordsWithoutDigit();
		String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
		object.wordsWithoutDigit(input);
		
	}

}
