package ruby;
/*Assignment-19 : 
Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  

Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"} */

public class ReverseExample {

		public static void main(String[] args) {
			ReverseExample assign =new ReverseExample();
			assign.reverseWord("This is technocredits");
			String[] input = {"Credits", "Techno","From","Diwali","Happy"};
			assign.reverseArray(input);
		}
		//print Reverse a given String
		void reverseWord(String word) {
			for(int index=word.length()-1;index>=0;index--) {
				System.out.print(word.charAt(index));
			}
			System.out.println();
		}
		//reverse given string array
		void reverseArray(String[] arr) {
			for(int index=arr.length-1;index>=0;index--) {
				System.out.print(arr[index]+" ");
			}		
		}
	}

