package anjaliP;

public class AreaPerimeterCal {
	float pi = 3.1416f;
	
	void rectangleCal1(int length,int width) {
		int rectangleArea=length*width;
		System.out.println("Area of Rectangle is : "+rectangleArea);
	}
	void rectangleCal2(float length , float width) {
		float rectanglePeri=2*length + 2*width;
		System.out.println("Perimeter of Rectangle is : "+rectanglePeri);	
	}
	void circleCal1(int radius) {
		float circleArea = pi * radius *radius;
		System.out.println("Area of Circle is : "+circleArea);
	}
	void circleCal2(int radius) {
		float circlePeri = 2*pi*radius;
		System.out.println("Perimeter of Circle is : "+circlePeri);
	}
	public static void main(String[]a) {
		AreaPerimeterCal areaPeri = new AreaPerimeterCal();
		areaPeri.rectangleCal1(12,13);
		areaPeri.rectangleCal2(15,12);
		areaPeri.circleCal1(12);
		areaPeri.circleCal2(20);
	}

}
