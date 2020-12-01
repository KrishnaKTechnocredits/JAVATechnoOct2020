package mrunal;
/*Program 2: print all the words where digit sum is > 10. 
String[] input = {"Ma1s3gj3Pw", "r4f3sjk","te3ch2no9","sfjk4p4plpk"};
output : te3ch2no9*/

public class prog2 {


		void DisplayWord(String arr[]) {
			for (int index = 0; index < arr.length; index++) {
				String word = arr[index];
				boolean flag = true;
				for (int index1 = 0; index1 < word.length(); index1++) {
					if (Character.isDigit(word.charAt(index1))) {
						flag = false;
						break;
					}
				}
				if (flag)
					System.out.print("Word without digit in array is-> " + word);
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String array[] = { "Masgj3Pw", "r4fsjk", "techno", "sfjk44lk" };
			prog2 printwordwithoutdigit = new prog2();
			printwordwithoutdigit.DisplayWord(array);
		}

	}