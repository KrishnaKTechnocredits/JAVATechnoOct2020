package priyanka.ArrayPrograms;

//Assignment 16: Find frequency of each character in a given string

public class FrequencyOfEachCharater {

	void findFrequency(String name) {
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int cnt = 0;
			for (int index = 0; index < name.length(); index++) {
				if (name.charAt(index) == ch)
					cnt++;
			}
			System.out.println("Character " + ch + " Occurance:" + cnt + " times");
		}
	}

	public static void main(String[] args) {
		FrequencyOfEachCharater frequencyOfEachCharater = new FrequencyOfEachCharater();
		frequencyOfEachCharater.findFrequency("technocreditss");
	}

}
