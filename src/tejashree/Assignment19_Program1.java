package tejashree;
//Reverse array
public class Assignment19_Program1 {
		void arrayReverse(String str[]) {
			for (int index1 = str.length - 1; index1 >= 0; index1--) {
				System.out.print(str[index1] + " ");
			}
		}

		public static void main(String args[]) {
			Assignment19_Program1 reversearray = new Assignment19_Program1();
			String arr[] = { "Tejashree", "Nishad", "Rajwade"};
			System.out.println("Reversed array is:");
			reversearray.arrayReverse(arr);
		}
}
