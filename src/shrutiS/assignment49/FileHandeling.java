package shrutiS.assignment49;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FileHandeling {
	static int totalFreq = 0;
	static int counter = 0;

	public static void printTotalFrequency(String line, String word) {
		String arr[] = line.split(" ");
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		for (int index = 0; index < arr.length; index++) {
			String key = arr[index];
			Integer value = hs.get(key);
			if (value != null)
				hs.put(key, value + 1);
			else
				hs.put(key, 1);
		}
		int indvFreq = hs.get(word);
		totalFreq += indvFreq;
		System.out.println("Frequency of " + word + " in line " + counter + " is: " + indvFreq);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(".\\src\\shrutiS\\assignment49\\readme.txt"));
		String line = "";
		String word = "Technocredits";
		while ((line = br.readLine()) != null) {
			counter++;
			printTotalFrequency(line, word);
		}
		br.close();
		System.out.println("Total frequency of " + word + " in given txt file is: " + totalFreq);
	}
}
