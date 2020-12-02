/*Program : 1 
swap 2 numbers without using 3rd variable*/

package vishakha;

public class Swap2NosWithout3rdVariable {
	
	void swap2Nos(){
		int x= 10, y = 100;
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("x = "+x+ " , y = "+y);
	}

	public static void main(String[] args) {
		new Swap2NosWithout3rdVariable().swap2Nos();
	}
}
