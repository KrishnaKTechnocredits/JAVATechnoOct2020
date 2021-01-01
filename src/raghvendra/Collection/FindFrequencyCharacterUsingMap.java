package raghvendra.Collection;
import java.util.HashMap;
/*Program 1:
Find frequency of each word from the String
String str1 = "hello gm hi gm hello pune gn";*/
public class FindFrequencyCharacterUsingMap {
	void displayFrequencyOfCharacterUsingMap(String st) {
		HashMap<String,Integer>map=new HashMap<>();
		String[] words=st.split(" ");
		for(int index=0;index<words.length;index++) {
			String eachWord=words[index];
			if(map.containsKey(eachWord)) {
				Integer count=map.get(eachWord)+1;
				map.put(eachWord, count);
			}
			else
				map.put(eachWord, 1);
		}
		System.out.println("Frequency of each character in String are as follows"+"\n"+map);
	}
	public static void main(String[] args) {
		FindFrequencyCharacterUsingMap findFrequencyCharacterUsingMap=new FindFrequencyCharacterUsingMap();
		String st="hello gm hi gm hello pune gn";
		System.out.println(st);
		findFrequencyCharacterUsingMap.displayFrequencyOfCharacterUsingMap(st);
	}
}
