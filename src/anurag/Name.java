package anurag;

public class Name {

	String name[] = { "Anurag", "Augustya", "Madhuendra" };

	String display() {

		String maxName = name[0];

		for (int index = 0; index < 3; index++) {

			if (name[index].length() > maxName.length()) {

				maxName = name[index];
			}

		}

		return maxName;

	}

	void displayEven() {

		Name calc = new Name();
		String ans = calc.display();
		System.out.println("Even positions of string with maximum length are below : ");
		for (int index = 1; index < ans.length(); index = index + 2)
			System.out.println(ans.charAt(index));
	}

	public static void main(String[] args) {

		Name name = new Name();
		String maxName = name.display();
		System.out.println("String with Maximum Length in the given array-> " + maxName);
		System.out.println("Length of string with maximum length in the given array -> " + maxName.length());
		name.displayEven();

	}
}
