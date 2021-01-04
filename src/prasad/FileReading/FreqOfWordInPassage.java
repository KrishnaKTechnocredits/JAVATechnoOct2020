package prasad.FileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
Assignment 49 : 3rd Jan'2021
1) Read file and print total frequency of "Technocredits" word.
*/
public class FreqOfWordInPassage {
	int wordCount;
	String searchWord= "and";
	void readFile() {
		try {
			Scanner scanner = new Scanner(new File("C:\\Users\\Prasad Chitale\\Documents\\java_selenium\\Eclipse\\workspace\\Eclipse Java Project\\src\\FileReading\\Text"));
			while(scanner.hasNext()) {
				String str = scanner.nextLine();
				String []array = str.split(" ");
				for(int index=0;index<array.length;index++) {
					String word = array[index];
					if(word.equalsIgnoreCase(searchWord)) {
						wordCount++;
					}
				}
			}
			System.out.println("Frequency of word, " + searchWord +" in text file is " +wordCount);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[]arg) {
		FreqOfWordInPassage freqofwordinpassage = new FreqOfWordInPassage();
		freqofwordinpassage.readFile();
	}

}
