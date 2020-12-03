package suvela.inheritance.p2;

import suvela.inheritance.p1.A;


public class C extends B{
 static int y=50;
 public static void m4() {
	 System.out.println("C m4 y"+y);
 }
 public void m5(int x) {
	 System.out.println("C m5");
 }
	public static void main(String[] args) {
		A a1= new A();
		B b1=new B();
		A ab= new B();
		A ac=new C();
		B bc= new C();
		C c1= new C();
		ac.m5(5);
		a1.m1();
		ab.m1();
		ab.m4();
		b1.m3();
		b1.m2();
		b1.m5();
		ac.m4();
		bc.m4();
		B.m4();
		c1.m4();
		//System.out.println(ab.x);
		System.out.println(bc.y);
		System.out.println(c1.x);
		System.out.println(c1.y);
		System.out.println(c1.z);
	}

}
