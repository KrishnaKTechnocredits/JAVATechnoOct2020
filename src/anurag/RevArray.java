package anurag;

//Assignment 19

/*reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}
*/

public class RevArray {

	void display() {

		String arr[] = { "Credits", "Techno", "From", "Diwali", "Happy" };
		for (int j = arr.length - 1; j >= 0; j--)

			System.out.println(arr[j]);
	}

	public static void main(String[] args) {

		RevArray rev = new RevArray();

		rev.display();

	}

}
