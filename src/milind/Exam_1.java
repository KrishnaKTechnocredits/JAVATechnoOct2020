package milind;

public class Exam_1 {
	
	String maxLengthName(String[] arr) {
		int maxLengthOfname = arr[0].length();
		String maxLengthName = arr[0];
		for(int index = 0; index < arr.length; index++) {
			if(maxLengthOfname < arr[index].length()) {
				maxLengthOfname = arr[index].length();
				maxLengthName = arr[index];
			}
		}
		System.out.println("Maximum length name is : " + maxLengthName + " total length is " + maxLengthOfname);
		return maxLengthName;
	}
	
	void displayEvencharFromName(String name) {
		int nameLength = name.length();
		int index = 1;
		while(index <= nameLength) {
			System.out.println(name.charAt(index));
			index = index + 2;
		}
	}
	
	public static void main(String[] args) {
		
		String[] name = {"Milind", "Chavhan", "milindBhairavi", "Bhairavi", "Patil"};
		Exam_1 exam_1 = new Exam_1();
		String maxLengthName = exam_1.maxLengthName(name);
		exam_1.displayEvencharFromName(maxLengthName);
	}

}
