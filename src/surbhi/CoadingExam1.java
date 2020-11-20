package surbhi;
public class CoadingExam1 {

	static String maximumLength(String[] arr) {
		String max = arr[0];
		for (int index = 0; index < arr.length; index++)
			if (max.length() < arr[index].length())
				max = arr[index];
		return max;
	}

	void even(String name) {
		for (int index = 0; index < name.length(); index++)
			if (index % 2 == 0)
				System.out.println(name.charAt(index));
	}

	public static void main(String[] args) {
		CoadingExam1 exam1 = new CoadingExam1();
		String[] array = { "Harsh", "Krishna", "Maulik", "Ritesh", "Pooja" };
		String maxLength = maximumLength(array);
		System.out.println("Maximum char string  " + maximumLength(array));
		System.out.println("Maximum char string length:" + maxLength.length());
		System.out.println("Maximum Length's Even Position Char:");
		exam1.even(maxLength);
	}

}
