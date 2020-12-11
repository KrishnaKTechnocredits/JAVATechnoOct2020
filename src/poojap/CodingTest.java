package poojap;

public class CodingTest {
	
	
	
	String getMaximumLength(String[] arr) {
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
		
		CodingTest codingTest = new CodingTest();
		String[] string = { "Harsh", "maulik", "Technocredits", "Krishna" };
		String max =codingTest.getMaximumLength(string);
		System.out.println("Maximum string is :" + max);
		System.out.println("Maximum string lenght is :" + max.length());
		System.out.println("even character of string is");
		codingTest.display(max);

	}

}


