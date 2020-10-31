/*	Date - 21-Oct-2020, Day 5
	Java Assignment 3 - Program:2

2. WAP to find the area and perimeter of Rectangle & Circle. 
NOTE : one method to calculate area and another for perimeter.
HINT : 
Rectangle area = length * width
Rectangle perimeter = 2*Length + 2*Width 
Circle area = pi*r*r, where r is radius Circle perimeter = 2*pi*r , where pi = 3.1416 */
package nitin;
class CalculateAreaPerimeter{

	float pi=3.1416f;
	
	void findAreaOfCircle(float radius){
		float circleArea=pi*radius*radius;
		System.out.println("Area Of Circle : "+circleArea);
	}
	void findAreaOfRectangle(float length,float width){
		float rectangleArea=length*width;
		System.out.println("Area Of Rectangle : "+rectangleArea);
	}
	void findPerimeterOfCircle(float radius){
		float circlePermimeter=2*pi*radius;
		System.out.println("Permimeter Of Circle : "+circlePermimeter);
	}
	void findPerimeterOfRectangle(float length,float width){
		float rectanglePerimeter=2*(length+width);
		System.out.println("Permimeter Of Rectangle : "+rectanglePerimeter);
	}
	public static void main(String[] a){
		CalculateAreaPerimeter calculateAreaPerimeter = new CalculateAreaPerimeter();
		calculateAreaPerimeter.findAreaOfCircle(4.5f);
		calculateAreaPerimeter.findAreaOfRectangle(2.5f,4.5f);
		calculateAreaPerimeter.findPerimeterOfCircle(5.5f);
		calculateAreaPerimeter.findPerimeterOfRectangle(2.2f,3.5f);
	}
}