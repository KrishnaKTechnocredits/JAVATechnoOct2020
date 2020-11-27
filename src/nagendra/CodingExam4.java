package nagendra;

public class CodingExam4 {

	void getIdenticalString(String userInput, String input2) {
		boolean flag = false;

		if (userInput.equalsIgnoreCase(input2)) {
			flag = true;
		}

		if (flag)
			System.out.println("Both String are Identical");
		else {
			System.out.println("Both String are Not identical");
		}
	}

	void getCommonElement(int[] input,int[] input2) {
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input2.length;j++){
				if(input[i]==input2[j]){
					System.out.println("Common :"+input[i]);
				}
			}
		}

	}

	public static void main(String[] args) {
		CodingExam4 object = new CodingExam4();
		String s1 = "pgne";
		String s2 = "pune";
		int array1 [] = {1, 2, 5, 5, 8, 9, 7, 10};
		int array2 [] = {1, 0, 6, 15, 6, 4, 7, 0};

		object.getIdenticalString(s1, s2);
		object.getCommonElement(array1, array2);
	}

}
