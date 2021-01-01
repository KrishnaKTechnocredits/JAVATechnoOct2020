package ritika.Assignments.asgmt_15;

/*Program 1 : [ Compulsory ]
Find the frequency of character from a given String array. [Estimated time: 15-20 mins]
sample input array : { "technocredits","elephant","earthear"} and char is 'e'
output : technocredits -> 2
elephant -> 2
earth -> 1
Total occurrence of e -> 5
*/

public class Asgmt_15_Pg_1 {

	void findFreqOfCharInStringArray(String[] arr, char ch) {
		int totalCount = 0;
		System.out.println("Individual count of " + ch + " in each word is");
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			int count = 0;
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(j) == ch) {
					count++;
					totalCount++;
				}
			}
			System.out.println(word + "-->" + count);
		}
		System.out.println("Total occurence of " + ch + " is --> " + totalCount);
	}

	public static void main(String[] args) {
		String[] array = { "technocredits", "elephant", "earth", "ear" };
		Asgmt_15_Pg_1 program1 = new Asgmt_15_Pg_1();
		program1.findFreqOfCharInStringArray(array, 'e');
	}
}