package suvela;

public class Exam3 {
	int count;

	void duplicateElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			int no = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				if (no == arr[j] && arr[i]!=-1) {
					count++;
					arr[j] = -1;
				}

			}
			if (count > 0 && arr[i]!=-1)
				System.out.println("Duplicate element is:" + no);
		}
	}

	void duplicateString(String[] s) {
		for (int i = 0; i < s.length; i++) {
			count = 0;
			String s1 = s[i];
			for (int j = i+1; j < s.length; j++) {
				if (s1.equals(s[j])&& s[i]!="") {
					count++;
					s[j] ="";
				}
			}
			if (count > 0 && s[i]!="")
				System.out.println("Duplicate element is:" + s1);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 12, 55, 32, 17, 12, 32,12,32 };
		String[] s = { "Techno", "Credits", "Techno", "Hi", "Hello", "Hi","Credits","Credits" };
		Exam3 exam = new Exam3();
		exam.duplicateElement(arr);
		exam.duplicateString(s);

	}

}
