package raghvendra.Collection;
import java.util.ArrayList;
import java.util.Arrays;
/*Assignment - 47 : 27th Dec'2020

Replace second last occurance of "Hi" with your name.
String msg = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output : Hi globant Hello Hi Hi globant Maulik Hello Hello globant Hi Techno Credits Techno */
public class ReplaceWord {
	void replaceSecondLastWord(String st, String name, String word) {
		String[] arr=st.split(" ");
		int secondIndex=0;
		int WordIndex=0;
		for(int index=arr.length-1;index>=0;index--) {
			if (arr[index].equals(word)&& secondIndex<2) {
				secondIndex++;
				WordIndex=index;
			}
		}
		arr[WordIndex]=name;
		System.out.println("String replaced with name:"+ Arrays.toString(arr));
	}
	

	public static void main(String[] args) {
		ReplaceWord replaceWord=new ReplaceWord();
		String st="Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		System.out.println("Given String: "+st);
		String name="Raghv";
		String word="Hi";
		replaceWord.replaceSecondLastWord(st, name, word);
	}
}
