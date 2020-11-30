package nagendra;

/*
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}
*/

public class ReverseArray {

	void getReverseArray(String[] userInput) {

		String[] outputArray = new String[userInput.length];
		int j = 0;
		for (int i = userInput.length - 1; i >= 0; i--) {
			System.out.println(userInput[i]);
			outputArray[j] = userInput[i];
			j++;
		}
	}

	public static void main(String[] args) {

		ReverseArray reverse = new ReverseArray();
		String[] input = { "Credits", "Techno", "From", "Diwali", "Happy" };
		reverse.getReverseArray(input);
	}

}
