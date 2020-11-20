package dhara.Static;

public class C {

		public void m4() {
			System.out.println("Class C : m4 calling non static method of Class C : m5");
			m5();
		}
		
		void m5() {
			System.out.println("Class C: m5 calling static method od Class D : m6");
			D.m6();
		}
}
