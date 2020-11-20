package vishakha;

class AreaPerimeter{

	float pi = 3.1416f;
	
	void calculateArea(int length, int width, int radius){
		double circleArea = pi*radius*radius;
		System.out.println("Area of Circle is : "+circleArea);
		double rectArea = length*width;
		System.out.println("Area of Rectangle is : "+rectArea);
	}
	
	void calculatePerimeter(int length, int width, int radius){
		double circlePerimeter = 2*pi*radius;
		System.out.println("Perimeter of Circle is : "+circlePerimeter);
		double rectPerimeter = 2*(length+width); 
		System.out.println("Perimeter of Rectangle is : "+rectPerimeter);
	}
	
	public static void main(String[] a){
		AreaPerimeter areaPerimeter = new AreaPerimeter();
		areaPerimeter.calculateArea(2,3,2);
		areaPerimeter.calculatePerimeter(2,3,3);
	}
}