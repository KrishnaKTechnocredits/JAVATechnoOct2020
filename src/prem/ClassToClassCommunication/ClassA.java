package prem.ClassToClassCommunication;

//Assignment#10
//Communication between Class

public class ClassA {

		void m1() {
			
			System.out.println("m1 of ClassA"); 
			
			ClassB classB = new ClassB();
			
			classB.m2();                           //m1 calling m2 of classA 
		}
		
		public static void main(String[] args) {
			
			ClassA classA = new ClassA();
			
			classA.m1();
		}
				
	}

