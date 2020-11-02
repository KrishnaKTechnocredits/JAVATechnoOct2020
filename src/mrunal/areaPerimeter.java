package mrunal;

public class areaPerimeter {
	double pi=3.146;
	
	void areaRectangle(int length , int width) {
		int AreaofRectangle = length*width;
		System.out.println("Area of Rectangle is : " + AreaofRectangle);
	}
	
	void perimeterRectangle(int length , int width) {
		int PerimeterofRectangle = ((2*length)+(2*width));
		System.out.println("Perimeter of Rectangle is : " + PerimeterofRectangle);
	}
	
	void areaCircle(int radius) {
		double AreaofCircle = pi*radius*radius;
		System.out.println("Area of Circle is : " + AreaofCircle);
	}
	
	void perimeterCircle(int radius) {
		double PerimeterofCircle =2*pi*radius ;
		System.out.println("Perimeter of Circle is : " + PerimeterofCircle);
	}

	public static void main(String[] args) {
		areaPerimeter ap = new areaPerimeter();
		ap.areaRectangle(10,10);
		ap.perimeterRectangle(10,15);
		ap.areaCircle(10);
		ap.perimeterCircle(10);

		

	}

}
