package vaibhav.assignment44;


/*Program 2:
Find frequency of each number from the Array
Integer arr[] = {23,12,45,67,23,12,67,33}*/


import java.util.HashMap;

public class FindFrequencyOfInteger {

	private static void displayFrequency(Integer arr[]) {
		
		HashMap <Integer,Integer> hp = new HashMap <Integer,Integer> ();
		
		for (int i = 0 ; i < arr.length;i++) {
			if(!hp.containsKey(arr[i]))
				hp.put(arr[i], 1);
			else
				hp.put(arr[i], hp.get(arr[i])+1);			
		}
		System.out.println(hp);
	}

	public static void main(String[] args) {		
		Integer arr[] = {23,12,45,67,23,12,67,33};
		FindFrequencyOfInteger.displayFrequency(arr);		
	}

}
