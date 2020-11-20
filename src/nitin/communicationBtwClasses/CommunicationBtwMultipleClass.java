package nitin.communicationBtwClasses;

public class CommunicationBtwMultipleClass {
	static String general;
	void setA(String general) {
		System.out.println(general);
		System.out.println("You are calling setB non-static method of ClassM1, Thank you..!!");
		ClassM1 classM1=new ClassM1();
		classM1.setB();
	}
	
	public static void main(String[] args) {
		CommunicationBtwMultipleClass communicationBtwMultipleClass=new CommunicationBtwMultipleClass();
		communicationBtwMultipleClass.setA("Hello World.. Let's Understand the concepts of Static & Non-Static in Java");
	}
}
