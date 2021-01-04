/*Assignment - 45 : 

Print all the words having frequency less than or equal to 2. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
output :  Techno -> 2
                  Credits -> 1 
 
 */

package kajol;
import java.util.LinkedHashMap;
import java.util.Set;

public class ComparisonOfWordsFrequencyUsingMap {
	
	void findFrequency(String str){	
		LinkedHashMap<String,Integer> map= new LinkedHashMap<>();
		String[] splitArray=str.split(" ");
		for(int index=0;index<splitArray.length;index++) {
			if(map.containsKey(splitArray[index])) 
				map.put(splitArray[index], map.get(splitArray[index])+1);
			else
				map.put(splitArray[index], 1);
		}
		
		Set<String> set=map.keySet();
		for(String KeyValue: set) {
			if(map.get(KeyValue)<=2)
				System.out.println(KeyValue+"-->"+map.get(KeyValue));
		}
	}
	
	public static void main(String[] args) {
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hello globant Hi Techno Credits Techno";
		System.out.println("Given String is: "+input);
		System.out.println("Words from above String having frequency less than or equal to 2 are:");
		new ComparisonOfWordsFrequencyUsingMap().findFrequency(input);
	}
}
