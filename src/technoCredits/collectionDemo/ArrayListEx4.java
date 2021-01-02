package technoCredits.collectionDemo;

import java.util.ArrayList;

import javax.sound.midi.Synthesizer;

public class ArrayListEx4 {
	
	public static void main(String[] args) {
		ArrayList<String> listOfName = new ArrayList<String>();
		listOfName.add("Rohan");
		listOfName.add("Pooja");
		listOfName.add("Ankita");
		listOfName.add("Nandini");
		listOfName.add("Nagendra");
		
		System.out.println("Before - " + listOfName);
		boolean flag = listOfName.remove("Pooja");
		System.out.println("Return type of Remove method is boolean : " + flag);
		System.out.println("Before - " + listOfName);
		
		String removedName = listOfName.remove(2);
		System.out.println("We removed "+ removedName + " from the list");
		System.out.println("Now list is " + listOfName);
		
		listOfName.add(1, "Vishakha");
		System.out.println(listOfName);
		
		String replacedName = listOfName.set(listOfName.size()-1, "Techno");
		System.out.println("Replaced name is " + replacedName);
		System.out.println(listOfName);
	}
}
