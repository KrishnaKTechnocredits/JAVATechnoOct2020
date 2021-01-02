package technoCredits.collectionDemo;

import java.util.ArrayList;

public class ArrayListEx5 {

	void findFreq(ArrayList<String> listOfName, String target) {
		int count = 0;
		while (listOfName.indexOf("Prem") != -1) {
			listOfName.remove("Prem");
			count++;
		}
		System.out.println("Freq of " + target + " is " + count);
	}

	
	
	void findFreqUsingForLoop(ArrayList<String> listOfName, String target) {
		int count = 0;
		ArrayList<String> temp = listOfName;
		for (int index=0;index<listOfName.size();index++) {
			if (listOfName.get(index).equals(target)) {
				listOfName.remove(target);
				count++;
			}
		}
		System.out.println("Freq of " + target + " is " + count);
		System.out.println(temp.contains(target)); // true / false
	}

	void findFreqUsingEnhanceForLoop(ArrayList<String> listOfName, String target) {
		int count = 0;
		ArrayList<String> temp = listOfName;
		for (String name : listOfName) {
			if (name.equals(target)) {
				listOfName.set(listOfName.indexOf(target), "Vishakha");
				count++;
			}
		}
		System.out.println("Freq of " + target + " is " + count);
		//System.out.println(temp.contains(target)); // true / false
	}
	
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Milind");
		nameList.add("Prem");
		nameList.add("Ruby");
		nameList.add("Prem");
		nameList.add("Priyanka");
		nameList.add("Ritika");
		nameList.add("Prem");
		nameList.add("Sadhna");
		nameList.add("Prem");
		nameList.add("Monika");
		new ArrayListEx5().findFreqUsingEnhanceForLoop(nameList, "Prem");
		System.out.println(nameList);
		
	}
}
