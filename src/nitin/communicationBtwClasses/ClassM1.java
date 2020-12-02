package nitin.communicationBtwClasses;

public class ClassM1 {
	static String company;
	void setB() {
		System.out.println("You are calling setC static method of ClassM1, Thank you..!!");
		setC("TATA");
		
	}
	static void setC(String company) {
		System.out.println("You are calling setD non-static method of ClassM1, Thank you..!!");
		System.out.println(company);
		ClassM2 classM2=new ClassM2();
		classM2.setD();
	}
}
