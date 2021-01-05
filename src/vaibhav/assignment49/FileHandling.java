package vaibhav.assignment49;

/*Assignment 49 : 3rd Jan'2021 
1) Read file and print total frequency of "Technocredits" word.
2) Read file and print frequency of "Technocredits" word in each line.*/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {
	private static int getCount(Scanner scanner) {
		String expected = "Technocredits";
		int count = 0 ;
		while(scanner.hasNextLine()) {
			String temp = scanner.nextLine();
			String [] arr=temp.split(" ");
			for(int index = 0 ; index < arr.length;index++) {
				if(expected.equals(arr[index]))
					count++;
			}			
		}		
		return count;
	}
	
	private static void displayEachLineCount(Scanner scanner) {
		String expected = "Technocredits";
		int lineNumber = 0;
		while(scanner.hasNextLine()) {		
			int count = 0 ;
			lineNumber++;
			String temp = scanner.nextLine();
			String [] arr=temp.split(" ");
			for(int index = 0 ; index < arr.length;index++) {				
				if(expected.equals(arr[index])) {
					count++;
				}
			}	
			System.out.println("Count of Technocredits on line number "+lineNumber+" is "+count);
		}
		
		
	}

	public static void main(String[] args) {
		String source = "D:\\TechnoCredits\\OCT20-Eclipse Programs\\JAVATechnoOct2020\\src\\vaibhav\\assignment49\\readme";
		File file = new File(source);	
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			/*int count = FileHandling.getCount(scanner);   //for program 1 we need to uncomment this
			System.out.println("Total Count of Technocredits is "+count)*/; ////for program 1 we need to uncomment this
			FileHandling.displayEachLineCount(scanner);//this is program 2 where we will find technocredits word in each line.
			
		} catch (FileNotFoundException e) {
			System.out.println("Please check the file path");
		}		
		
	}

}
