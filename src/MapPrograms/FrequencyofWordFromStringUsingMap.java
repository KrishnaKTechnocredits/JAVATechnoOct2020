/*Assignment : 44 

Program 1:
Find frequency of each word from the String
String str1 = "hello gm hi gm hello pune gn";
*/

package MapPrograms;

import java.util.HashMap;

public class FrequencyofWordFromStringUsingMap {
	
	HashMap<String,Integer> findFrequency(String str){	
		HashMap<String,Integer> map= new HashMap<>();
		String[] splitArray=str.split(" ");
		for(int index=0;index<splitArray.length;index++) {
			if(map.containsKey(splitArray[index])) 
				map.put(splitArray[index], map.get(splitArray[index])+1);
			else
				map.put(splitArray[index], 1);
		}
		return map;	
	}

	public static void main(String[] args) {
		String str="hello gm hi gm hello pune gn";
		System.out.println("Given String is: "+str);
		System.out.println("Frequency of Words in above String: "+new FrequencyofWordFromStringUsingMap().findFrequency(str));
		
	}
}
