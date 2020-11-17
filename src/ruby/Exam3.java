package ruby;
/*Exam3: find duplicate from given array.
input : int[] arr = {10,12,55,32,17,12,32};
output : 12
         32

String[] names = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
output : Techno
         Hi
*/
public class Exam3 {

	void duplicateNum(int[] num) {
		for (int i = 0; i < num.length; i++) {
			int count = 0;
			for (int j = 0; j < num.length; j++) {
				if (num[i] == num[j]) {
					count++;
				}
			}
			if (count > 1)
				System.out.println(num[i]);
		}
	}

	void duplicateWord(String[] input) {
		for (int i = 0; i < input.length; i++) {
			int count = 0;
			for (int j = 0; j < input.length; j++) {
				if (input[i].equals(input[j])) {
					count++;
				}
			}
			if (count > 1)
				System.out.println(input[i]);
		}

	}

	public static void main(String[] args) {
		Exam3 exam3 = new Exam3();
		int[] num = { 10, 12, 55, 32, 17, 12, 32 };
		String[] names = { "Techno", "Credits", "Techno", "Hi", "Hello", "Hi" };
		exam3.duplicateNum(num);
		exam3.duplicateWord(names);
	}

}
