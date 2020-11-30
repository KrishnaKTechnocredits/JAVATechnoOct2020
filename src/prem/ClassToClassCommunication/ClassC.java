package prem.ClassToClassCommunication;

// Assignment#10
// Communication between Class

public class ClassC {

		void m4() {
			
			System.out.println("non static m4 of ClassC");
			
			ClassC classC = new ClassC();
			
			classC.m5();                                  
		}
		
		void m5() {
			
			System.out.println("non static m5 of ClassC");
			
			ClassD.m6();                                     //m5 calling m6 of class D
		}
				
}


