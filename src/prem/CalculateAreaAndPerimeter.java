package prem;

// Date - 21-Oct-2020, Day 5
//Java Assignment 3 - Program:2

//WAP to find the area and perimeter of Rectangle & Circle.
//NOTE : one method to calculate area and another for perimeter.

/*Rectangle area = length * width
Rectangle perimeter = 2*Length + 2*Width
Circle area = pi*r*r, where r is radius ¨Circle perimeter = 2*pi*r , where pi = 3.1416 */


public class CalculateAreaAndPerimeter {

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
		
		CalculateAreaAndPerimeter calculateAreaAndPerimeter = new CalculateAreaAndPerimeter();
		
		calculateAreaAndPerimeter.findAreaOfCircle(5.5f);
		
		calculateAreaAndPerimeter.findAreaOfRectangle(2.5f,5.5f);
		
		calculateAreaAndPerimeter.findPerimeterOfCircle(6.5f);
		
		calculateAreaAndPerimeter.findPerimeterOfRectangle(2.2f,3.5f);
	}
}

