package vishakha;

public class Swap2StringWithout3rdVariable {
	
	void swap2String(){
		String a = "Hello", b = "World";
		a = a + b;
		b = a + b;
		a = a.substring(5);
		b = b.substring(0, 5);
		System.out.println("a = "+a+ " ,b = "+b);
	}

	public static void main(String[] args) {
		new Swap2StringWithout3rdVariable().swap2String();
	}
}
