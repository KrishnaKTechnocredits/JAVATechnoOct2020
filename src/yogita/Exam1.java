package yogita;

class Exam1 {

	static String maximumLength(String[] arr) {
		String max = arr[0];
		for (int index = 0; index < arr.length; index++)
			if (arr[index].length() > max.length())
				max = arr[index];
		return max;
	}

	void even(String name) {
		for (int index = 0; index < name.length(); index++)
			if (index % 2 != 0)
				System.out.println(name.charAt(index));
	}

	void odd(String name) {
		for (int index = 0; index < name.length(); index++)
			if (index % 2== 0)
				System.out.println(name.charAt(index));
	}

	public static void main(String[] args) {
		Exam1 exam1 = new Exam1();
		String[] array = { "Harsh", "Krishna", "Maulik", "Ritesh", "Pooja" };
		String maxLength = maximumLength(array);
		System.out.println("Maximum character string  " + maximumLength(array));
		System.out.println("Maximum character string length:" + maxLength.length());
		System.out.println("Maximum Length's Even Position Character:");
		exam1.even(maxLength);
		System.out.println("Maximum Length's Odd Position Character:");
		exam1.odd(maxLength);
	}
}