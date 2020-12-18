//Program 1: print all the words which does't have any digit. 
//String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};//// output : techno

package priya;

public class WordsDoesntContainDigit {

	static void printWordsWithoutDigit (String[] inputArray) {
		for (int index=0; index<inputArray.length; index++) {
			String word = inputArray[index];
			boolean flag=true;
			for (int innerIndex=0; innerIndex<word.length(); innerIndex++) {
				if (Character.isDigit(word.charAt(innerIndex))) {
					flag=false;
					break;
				}
			}
			if (flag)
				System.out.print(word + " ");
		}
	}

	public static void main(String[] args) {
		String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
		System.out.print("Word without digits in given array are: ");
		WordsDoesntContainDigit.printWordsWithoutDigit(input);
	}
}
