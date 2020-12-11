package rohit.ClassCommunication;

public class A {
 void m1()
 {
	 System.out.println("In non-static method A.m1");
	 B b=new B();
	 b.m2();
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  A a=new A();
  a.m1();
	}

}
