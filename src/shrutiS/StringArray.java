package shrutiS;

import java.util.Scanner;

public class StringArray {

	String getMaxLengthName(String[] name) {

		int maxStringlength = name[0].length();
		String maxname = name[0];

		for (int index = 0; index < name.length; index++) {

			if (maxStringlength < name[index].length()) {
				maxStringlength = name[index].length();
				maxname = name[index];
			}
		}
		return maxname;
	}
	void display(String name) {
		System.out.println("All even charcters of max length name "+name+" is");
		for (int index = 0; index < name.length(); index++) {

			if ((index + 1) % 2 == 0)
				System.out.print(name.charAt(index));
		}
	}

	public static void main(String[] args) {
		StringArray stringarray = new StringArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of names required: ");
		int length = sc.nextInt();
		String name[] = new String[length];
		for (int index = 0; index < length; index++) {
			System.out.println("Enter name "+(index+1));
			name[index] = sc.next();
		}
		String maxLengthName = stringarray.getMaxLengthName(name);
		System.out.println("Name with max length is \n" + maxLengthName + "-->" + maxLengthName.length());
		stringarray.display(maxLengthName);
	}

}
