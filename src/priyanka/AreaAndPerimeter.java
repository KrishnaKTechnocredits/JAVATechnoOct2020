package priyanka;

public class AreaAndPerimeter {
	float pi = 3.14f;

	void areaofrectangle(int length, int width) {
		System.out.println(" Area of Rectangle is : " + (length * width));
	}

	void areaofcircle(float radius) {
		System.out.println(" Area of Radius is : " + (pi * radius * radius));
	}

	void rectanglePerimeter(int length, int width) {
		System.out.println(" Perimeter of Rectangle is : " + (2 * length * width));
	}

	void circlePerimeter(float radius) {
		System.out.println(" Perimeter of Circle is : " + (2 * pi * radius));
	}

	public static void main(String[] args) {
		AreaAndPerimeter areaAndPerimeter = new AreaAndPerimeter();
		areaAndPerimeter.areaofrectangle(4, 5);
		areaAndPerimeter.areaofcircle(5);
		areaAndPerimeter.rectanglePerimeter(4, 5);
		areaAndPerimeter.circlePerimeter(5);
	}

}
