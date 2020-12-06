package prem;

public class Assignment15 {

		void charOccurance(String[] string, char ch) {
			int cnt = 0;
			for (int index = 0; index < string.length; index++) {
				for (int i = 0; i < string[index].length(); i++)
					if (string[index].charAt(i) == ch)
						cnt++;
				System.out.print(string[index] + "\t");
			}
			System.out.println("\nOccurance of Character " + ch + " is:" + cnt);
		}

		public static void main(String[] args) {
			Assignment15 assignment15 = new Assignment15();
			String[] arr = { "Maulik", "Techno", "Credits", "Maullik" };
			assignment15.charOccurance(arr, 'M');
		}
	}


