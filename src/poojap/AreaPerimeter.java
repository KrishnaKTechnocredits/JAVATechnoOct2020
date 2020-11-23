package poojap;

public class AreaPerimeter {
	
	float pi= 3.1416f;
	    
	void calculateArea(int lenght, int width,int radius) {
		
		double rectangleArea = lenght*width; 
		System.out.println("Area of Rectanlge is " +rectangleArea);
		double circleArea = pi*radius*radius;
		System.out.println("Area if circle is " +circleArea);
	}
	
	void calculatePerimeter(int lenght, int width,int radius) {
		
		double rectanlgePerimeter = 2*(lenght+width);
		System.out.println("Perimeter of Rectangle is " +rectanlgePerimeter);
		double circlePerimeter = 2*pi*radius;
		System.out.println("Perimeter of circle " +circlePerimeter);
	}
	
	public static void main(String[] args) {
		
		AreaPerimeter areaPerimeter = new AreaPerimeter();
		areaPerimeter.calculateArea(6, 10, 6);
		areaPerimeter.calculatePerimeter(8, 4, 9);
	}
	
}
