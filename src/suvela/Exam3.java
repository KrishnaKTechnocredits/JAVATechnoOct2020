package suvela;

public class Exam3 {
	int count;

	void duplicateElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			int no = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (no == arr[j]) {
					count++;
					arr[i] = 0;
				}

			}
			if (count > 1 && arr[i] == 0)
				System.out.println("Duplicate elements are:" + no);
		}
	}

	void duplicateString(String[] s) {
		for (int i = 0; i < s.length; i++) {
			count = 0;
			String s1 = s[i];
			for (int j = 0; j < s.length; j++) {
				if (s1 == s[j]) {
					count++;
					s[i] = null;
				}
			}
			if (count > 1 && s[i] == null)
				System.out.println("Duplicate elements are:" + s1);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 12, 55, 32, 17, 12, 32 };
		String[] s = { "Techno", "Credits", "Techno", "Hi", "Hello", "Hi" };
		Exam3 exam = new Exam3();
		exam.duplicateElement(arr);
		exam.duplicateString(s);

	}

}
