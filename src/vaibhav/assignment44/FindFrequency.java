package vaibhav.assignment44;

/*Assignment : 44 [24th Dec'2020]

Program 1:
Find frequency of each word from the String
String str1 = "hello gm hi gm hello pune gn";*/


import java.util.HashMap;

public class FindFrequency {
	

	static void displayFrequency(String str1) {
		HashMap <String,Integer> hp = new HashMap <String,Integer> ();
		String [] splittedArray = str1.split(" ");
		for (int i = 0 ; i < splittedArray.length;i++) {
			if(!hp.containsKey(splittedArray[i]))
				hp.put(splittedArray[i], 1);
			else
				hp.put(splittedArray[i], hp.get(splittedArray[i])+1);			
		}
		System.out.println(hp);
	}

	public static void main(String[] args) {		
		String str1 = "hello gm hi gm hello pune gn";
		FindFrequency.displayFrequency(str1);		
	}

}
