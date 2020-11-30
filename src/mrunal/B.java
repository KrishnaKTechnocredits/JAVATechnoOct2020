package mrunal;

public class B {

	void m2()
	{
		System.out.println("M3 is called by M2");
		B.m3();
	}
	
	static void m3()
	{
		System.out.println("M4 is called by M3");
		C c = new C();
		c.m4();
	}
}
