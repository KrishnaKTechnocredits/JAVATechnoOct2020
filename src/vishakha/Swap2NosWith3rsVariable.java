/*Program : 1 
swap 2 numbers with using 3rd variable*/

package vishakha;

public class Swap2NosWith3rsVariable {
	
	void swap2Nos(){
		int x= 10, y=20;
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x = " +x+ " , y = "+y);
	}

	public static void main(String[] args) {
		new Swap2NosWith3rsVariable().swap2Nos();
	}
}
