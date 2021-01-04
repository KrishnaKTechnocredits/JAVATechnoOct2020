package deepak.assignment49_FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FreqOfWordInEntireFile {
	
	String searchString = "Technocredits";
	int count;
	
	void readFile() {
		
		
		try {
			
			Scanner sc = new Scanner(new File("G:\\Technocredits\\Project\\Java_Program\\Eclipse_Practice\\javatechnooct2020\\src\\deepak\\assignment49_FileHandling\\Sample.txt"));
			
			while(sc.hasNext()) {
				
				String str = sc.nextLine();
				String[] arr = str.split("");
				
				
				for(int i=0; i<arr.length; i++) {
					String word = arr[i];
					
					if(word.equalsIgnoreCase(searchString)) {
						count++;
					}
					
				}
				
			}
			
			System.out.println("Frequency of word "+ searchString +" in entire file is :"+ count);
			
		}catch(FileNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
	}

	public static void main(String[] args) {
		
		FreqOfWordInEntireFile refVar = new FreqOfWordInEntireFile();
		
		refVar.readFile();
	}

}
