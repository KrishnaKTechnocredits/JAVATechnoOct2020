/*Program 1: print all the words which does't have any digit. 
String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
output : techno*/

package Himali_Assignment27;

public class Program1 {
	void wordWithoutDigit(String[] array) {
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length(); j++) {

				char ch = array[i].charAt(j);

				if (Character.isDigit(ch)) {
					flag = true;
					break;
				}

			}
			if (!flag) {
				System.out.println(array[i]);

			}
			flag = false;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] input = { "Masgj3Pw", "r4fsjk", "techno", "tefg", "sfjk44lk" };
		Program1 program1 = new Program1();
		program1.wordWithoutDigit(input);

	}

}
