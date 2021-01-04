/*Assignment - 46 
Print the words having maximum frequency. 
String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
output :  Hi ->7 
*/

package MapPrograms;

import java.util.LinkedHashMap;
import java.util.Set;

public class MaximumFrequencyWordUsingMap {
	
	void findMaximumFrequency(String str){	
		LinkedHashMap<String,Integer> map= new LinkedHashMap<>();
		String[] splitArray=str.split(" ");
		for(int index=0;index<splitArray.length;index++) {
			if(map.containsKey(splitArray[index])) 
				map.put(splitArray[index], map.get(splitArray[index])+1);
			else
				map.put(splitArray[index], 1);
		}
		
		Set<String> set=map.keySet();
		int MaximumFrequency=0;
		String MaximumWord=null;
		for(String KeyValue: set) {
			if(map.get(KeyValue)>MaximumFrequency) {
				MaximumFrequency=map.get(KeyValue);
				MaximumWord=KeyValue;
			}
		}
		System.out.println(MaximumWord+"-->"+MaximumFrequency);
	}

	public static void main(String[] args) {
		String input = "Hi globant Hello Hi Hi globant Hi Hello Hi Hi Hello globant Hi Techno Credits Techno";
		System.out.println("Given String is: "+input);
		System.out.println("Word from above String having Maximum frequency:");
		new MaximumFrequencyWordUsingMap().findMaximumFrequency(input);
	}
}
