package prasad.FileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*Assignment 49 : 3rd Jan'2021

1) Read file and print frequency of "Technocredits" word in each line.*/
public class FreqOfWordInEachLine {
	String searchWord = "cars";

	void readFile() {
		try {
			Scanner scanner = new Scanner(new File(
					"C:\\Users\\Prasad Chitale\\Documents\\java_selenium\\Eclipse\\workspace\\Eclipse Java Project\\src\\FileReading\\Text"));
			while (scanner.hasNext()) {
				String str = scanner.nextLine();
				String[] array = str.split(" ");
				int count = 0;
				for (int index = 0; index < array.length; index++) {
					String word = array[index];
					if (word.equalsIgnoreCase(searchWord)) {
						count++;
					}
				}
				System.out.println(str + " ---> occurance of :- " + searchWord + " : "+ count);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] arg) {
		FreqOfWordInEachLine readtxt = new FreqOfWordInEachLine();
		readtxt.readFile();
	}

}
