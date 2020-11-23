package rohit;

public class Reversestringarray {
	void reversestringarray(String[] str) {
			String[] temp = new String[str.length];
			int count = 0;
			System.out.print("\nReverse of given String Array : ");
			for (int i = str.length - 1; i >= 0; i--) {
				temp[count] = str[i];
				System.out.print(temp[count] + " ");
				count++;
			}
		}

	public static void main(String[] args) {
		Reversestringarray stringarray = new Reversestringarray();
		String[] str = { "Credits", "Techno", "From", "Diwali", "Happy" };
		System.out.print("String Array : ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		stringarray.reversestringarray(str);
	}
}
