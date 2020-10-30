package ankita.practise;

public class Practise1 {
	void findCircumferenceOfCircle(int radius) {
		System.out.println("Circumference of circle with radius : " + (2*3.14*radius));
	}
	void findAreaOfCircle(int radius) {
		System.out.println("Area of circle with radius : " + (3.14*radius));
	}
	public static void main(String[] args) {
		Practise1 practise1 = new Practise1();
		practise1.findCircumferenceOfCircle(8);
		practise1.findAreaOfCircle(8);
		
	}
}
