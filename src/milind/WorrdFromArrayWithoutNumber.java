package milind;

public class WorrdFromArrayWithoutNumber {
	
	void printWordFromArrayWithoutNumber(String[] input) {
		System.out.println("Word without number : ");
		for(int index = 0; index < input.length; index++) {
			boolean flag = true;
			String wordFromArray = input[index];
			for(int innerIndex = 0; innerIndex < wordFromArray.length(); innerIndex++) {
				char ch = wordFromArray.charAt(innerIndex);
				if(Character.isDigit(ch)) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println(wordFromArray);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] input = {"chavhan","Masgj3Pw", "r4fsjk","techno","sfjk44lk","Milind"};
		WorrdFromArrayWithoutNumber worrdFromArrayWithoutNumber = new WorrdFromArrayWithoutNumber();
		worrdFromArrayWithoutNumber.printWordFromArrayWithoutNumber(input);
	}
}
