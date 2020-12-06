package prem.ClassToClassCommunication;

// Assignement#10
// Communication between Class

public class ClassD {
	
		static void m6() {
			
			System.out.println("static m6 of ClassD");
			
			ClassD.m7();
			
		}
		static void m7() {
			
			System.out.println("static m7 of ClassD");
			
		}

}

