/*
  Program 1: print all the words which does't have any digit. 
  
  String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
  
  output : techno
  
   */
package yogita;

import java.util.Arrays;

public class FindWithoutNumberString {

	void withoutNumberString(String[] name) {
		System.out.println("Array Of String is:" + Arrays.toString(name));
		for (int i = 0; i < name.length; i++) {
			String str = name[i];
			boolean flag = false;
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (Character.isDigit(ch)) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("Without Digit String From Array is:" + str);
			}
		}
	}

	public static void main(String[] args) {
		FindWithoutNumberString withoutNumber = new FindWithoutNumberString();
		String[] input = { "Masgj3Pw", "r4fsjk", "techno", "sfjk44lk" };
		withoutNumber.withoutNumberString(input);
	}
}
