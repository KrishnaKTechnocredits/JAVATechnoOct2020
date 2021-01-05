/*Assignment 49 : 3rd Jan'2021
1) Read file and print total frequency of "Technocredits" word.
2) Read file and print frequency of "Technocredits" word in each line.
*/
package ankita.assignment.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class FileWordFreq {
	static void getLineTotalFreq(BufferedReader br) throws IOException {
		System.out.println("========================Line Frequency==========================");	
		String line = "";
		while ((line = br.readLine()) != null) {
			if (line.contains("Technocredits")) {
				int count = 0;
				String[] str = line.split(" ");
				for (int i = 0; i < str.length; i++) {
					if (str[i].equals("Technocredits"))
						count++;
				}
				System.out.println(line);
				System.out.println("Frequency : " + count);
			}
		}
	}

	static int getTotalFreq(BufferedReader br) throws IOException {
		System.out.println("========================Total Frequency==========================");	
		int count = 0;
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			if (line.contains("Technocredits")) {
				String[] str = line.split(" ");
				for (int i = 0; i < str.length; i++) {
					if (str[i].equals("Technocredits"))
						count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(".\\src\\ankita\\assignment\\file\\readme.txt"));
		getLineTotalFreq(br);
		BufferedReader br1 = new BufferedReader(new FileReader(".\\src\\ankita\\assignment\\file\\readme.txt"));
		System.out.println("Total frequency  of Technocredit: " + getTotalFreq(br1));

	}
}
