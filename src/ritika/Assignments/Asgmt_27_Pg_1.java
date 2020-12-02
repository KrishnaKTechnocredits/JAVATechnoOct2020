package ritika.Assignments;
/*Assignment - 27: 23rd Nov'2020

Program 1: print all the words which does't have any digit.
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno

Program 2: print all the words where digit sum is > 10.
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9
*/
public class Asgmt_27_Pg_1 {
	
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
		String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk", "credits", "jd78dsd"};
		System.out.println("Words without digits in given array are: ");
		Asgmt_27_Pg_1.printWordsWithoutDigit(input);
	}
}
