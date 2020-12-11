package nagendra;


public class JavaExam1 {

	String getMaxLengthName(String[] arr) {
		{
			String max = arr[0];

			for (int index = 0; index < arr.length; index++) {
				if (max.length() < arr[index].length()) {
					max = arr[index];

				}

			}
			return max;

		}
	}

	void display(String name) {

		for (int index = 0; index < name.length(); index++) {
			if (index % 2 == 0) {
				System.out.println(name.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		JavaExam1 exam = new JavaExam1();
		String[] name = { "Harsh", "maulik", "Technocredits", "Krishna" };
		String max = exam.getMaxLengthName(name);
		System.out.println("Maximim char staring is :" + max);
		System.out.println("Maximim char staring lengh is :" + max.length());

		exam.display(max);

	}

}
