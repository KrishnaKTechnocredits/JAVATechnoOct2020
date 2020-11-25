package ritika.Assignments;
/*
Assignment 19
Program : 2
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"} 
*/
public class Asgmt_19_Pg2 {

	void reverseWordsFromArray(String[] arr) {
		for (int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		String [] input = {"Credits", "Techno","From","Diwali","Happy"} ;
		Asgmt_19_Pg2 program2 =  new Asgmt_19_Pg2();
		program2.reverseWordsFromArray(input);
	}
}
