package raghvendra.FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
//Read file and print total frequency of "Technocredits" word.
public class TotalFrequencyFromFile {
	static int count=0;
	private static void getFreq(String line, String Word) {
		String[] str=line.split(" ");
		for(int index=0;index<str.length;index++) {
			if(Word.equals(str[index]))
				count++;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Java Selenium\\FileReaderTechno.txt"));
		String line = "";
		String word="Technocredits";
		while((line = br.readLine()) != null) {
			System.out.println(line);
			getFreq(line,word);
		}
		System.out.println(word+" Frequency in above lines are : "+count);
	}
}
