package nitin.communicationBtwClasses;

public class ClassM2 {
	String name;
	void setD() {
		System.out.println("You are calling setE non-static method of ClassM2, Thank you..!!");
		setE("Nitin");
		
	}
	void setE(String name) {
		this.name=name;
		System.out.println("You are calling setF static method of ClassM3, Thank you..!!");
		System.out.println(name);
		new ClassM3();
		ClassM3.setF();
	}
}
