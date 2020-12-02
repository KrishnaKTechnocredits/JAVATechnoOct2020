package nagendra;

public class B {

	void m2(){

		System.out.println("Class B M2 Method");
		B.m3();
	}
	
	static void m3(){
		System.out.println("Class B Static M3 Method");
		C c=new C();
		c.m4();
		
	}
}
