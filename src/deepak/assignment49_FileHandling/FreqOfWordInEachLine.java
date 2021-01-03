/*
 * Read file and print frequency of "Technocredits" word in each line.
 */


package deepak.assignment49_FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FreqOfWordInEachLine {
	String searchString = "Technocredits";
	
	void readFile() {
		
		try {
			
			Scanner sc = new Scanner(new File(".\\src\\deepak\\assignment49_FileHandling\\sample.txt"));
		
			String line = "";
			while(sc.hasNextLine()) {
				
				line = sc.nextLine();
				String[] arr = line.split("");
				int count=0;
				for(int i=0; i<arr.length; i++) {
					
					String word = arr[i];
					
					if(word.equalsIgnoreCase(searchString)) {
						count++;
					}
				}
				System.out.println(line + " : "+ "occurances : "+ count);				
			}
		}
		
		catch(FileNotFoundException fne) {
			
			System.out.println("File not Found");
		}
	}

	public static void main(String[] args) {
		
		FreqOfWordInEachLine refVar = new FreqOfWordInEachLine();
		refVar.readFile();	
	}	
}
