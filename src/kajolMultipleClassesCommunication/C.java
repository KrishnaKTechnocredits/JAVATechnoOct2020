package kajolMultipleClassesCommunication;

public class C {

		void m4() {
			System.out.println("Class C: Method m4 is Non Static Method.");
			System.out.println("Method m4 of Class C is calling Non Static Method m5 of same Class C,hence object Creation is not necessary.");
			System.out.println();
			m5();
		}
		
		void m5() {
			System.out.println("Class C: Method m5 is Non Static Method");
			System.out.println("Method m5 of Class C is calling Static Method m6 of Class D,hence object Creation is not necessary.");
			System.out.println();
			D.m6();
			System.out.println();
			
		}
}
