/*swap 2 String with using 3rd variable*/

package vishakha;

public class Swap2StringWith3rdVariable {
	
	void swap2String(){
		String a = "Hello", b = "World";
		String temp = a;
		a = b;
		b = temp;
		System.out.println("a = "+a+ " ,b "+b);
	}

	public static void main(String[] args) {
		new Swap2StringWith3rdVariable().swap2String();
	}
}
