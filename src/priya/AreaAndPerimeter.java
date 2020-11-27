package priya;

public class AreaAndPerimeter {

	void areaOfRectangle(int length, int width) {
		int rectangleArea = length * width;
		System.out.println("Area of Rectangle is " +rectangleArea);
	}
	void perimeterOfRectangle(int length, float width) {
		float rectanglePerimeter = 2*length + 2*width;
		System.out.println("Perimeter of Rectangle is " +rectanglePerimeter);
	}
	void areOfCircle(float pi ,float radius) {
		float circleArea = pi*radius*radius;
		System.out.println("Area of Circle is " +circleArea);
	}
	void perimeterOfCircle(float pi ,float radius) {
		float circlePerimeter = 2*pi*radius;
		System.out.println("Perimeter of Circle is " +circlePerimeter);
	}
	public static void main(String[] args) {
		AreaAndPerimeter areaOfPerimeter = new AreaAndPerimeter();
		areaOfPerimeter.areaOfRectangle(2,4);
		areaOfPerimeter.perimeterOfRectangle(2,4.4f);
		areaOfPerimeter.areOfCircle(2f,6f);
		areaOfPerimeter.perimeterOfCircle(2f, 4.8f);
	}
}
