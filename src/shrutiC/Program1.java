package shrutiC;

/*
	Assignment - 27: 23rd Nov'2020  
	
	Program 1: print all the words which does't have any digit. 
	String[] input = {"Masgj3Pw", "r4fsjk","techno","sfjk44lk"};
	output : techno
*/
public class Program1 {

	void displayWordWithoutDigit(String[] array) {

		String str = "";
		System.out.print("Input array : { ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" , ");
			if (!isDigit(array[i]))
				str += array[i] + " ";
		}
		System.out.println(" }");
		System.out.println("Words without digit are : " + str);
	}

	boolean isDigit(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Program1 object = new Program1();
		String[] inputArray = { "Masgj3Pw", "r4fsjk", "techno", "sfjk44lk" };
		object.displayWordWithoutDigit(inputArray);
	}

}