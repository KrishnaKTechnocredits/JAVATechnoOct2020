package ankit.inBetweenMethodsCall;

public class C {

	void m4() {
		System.out.println("Calling method M5");
		m5();
	}
	
	void m5() {
		System.out.println("Calling static method M6");
		//D d = new D(); 
		
		/*Can call using object also, as anything can be called using object.
		 * But we can directly call static method from non static method.
		 */
		D.m6();
	}

}
