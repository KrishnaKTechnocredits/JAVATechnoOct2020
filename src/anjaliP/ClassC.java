package anjaliP;

class ClassC {
	  void m4() {
		System.out.println("Method m4 from ClassC calling m5 from same class");
		ClassC cClass = new ClassC();
		cClass.m5();
	}
	 void m5() {
		System.out.println("Method m5 from ClassC calling m6 from ClassD");
		ClassD.m6();	
	}
}
