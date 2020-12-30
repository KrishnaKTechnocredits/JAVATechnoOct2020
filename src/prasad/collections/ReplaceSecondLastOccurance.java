package prasad.collections;

import java.util.LinkedList;

/*Assignment - 47 : 27th Dec'2020

Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno*/

public class ReplaceSecondLastOccurance {
	static LinkedList<String> listOfWords(String[]words,String input){
		LinkedList<String> output = new LinkedList<>();
		for(int index=0;index<words.length;index++) {
			String word = words[index];
			output.add(word);	
		}
		
		int count = output.lastIndexOf(input);
		
		for(int index=count-1;index>=0;index--) {	
			String compare = output.get(index);
			if(compare.equals(input)) {
			output.remove(index);
			output.add(index, "Prasad");
			break;
			}
		}
		
		return output;
	}
	
	public static void main (String[]arg) {
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		String [] words = input.split(" ");
		LinkedList<String> output = ReplaceSecondLastOccurance.listOfWords(words,"Hi");
		//System.out.println(output);
		String str1 = String.join(" ", output);
		System.out.println(str1);
	}

}
