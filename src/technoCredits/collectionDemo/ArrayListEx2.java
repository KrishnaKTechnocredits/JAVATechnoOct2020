package technoCredits.collectionDemo;

import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {
		ArrayList listOfNames = new ArrayList();
		listOfNames.add(1);
		listOfNames.add("Maulik");
		listOfNames.add("Techno");
		listOfNames.add(2);

		String msg = "";
		int sum = 0;

		for (int index = 0; index < listOfNames.size(); index++) {
			String temp = "";
			try {
				temp = String.valueOf(listOfNames.get(index));
				int num = Integer.parseInt(temp);
				sum = sum + num;
			} catch (NumberFormatException e) {
				msg = msg + temp;
			}

		}
		System.out.println(msg);
		System.out.println(sum);
	}
}
