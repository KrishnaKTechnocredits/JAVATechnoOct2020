package raghvendra.FileReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
//Read file and print frequency of "Technocredits" word in each line.
public class FrequencyOfwordInEachLineFromFile {
	private static void getFreq(String line, String Word) {
		int count=0;
		String[] str=line.split(" ");
		for(int index=0;index<str.length;index++) {
			if(Word.equals(str[index]))
				count++;
		}
		System.out.println(Word+" Frequency in above line : "+count);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Java Selenium\\FileReaderTechno.txt"));
		String line = "";
		String word="Technocredits";
		while((line = br.readLine()) != null) {
			System.out.println(line);
			getFreq(line,word);
		}
	}
}
