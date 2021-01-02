package technoCredits.fileHandlingEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(".\\src\\technoCredits\\fileHandlingEx\\readme.txt"));
		String line = "";
		while (sc.hasNextLine()) {
			line = sc.nextLine();
			System.out.println(line);
		}

	}
}
