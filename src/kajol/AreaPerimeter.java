package kajol;
class AreaPerimeter{
	
	void calculateAreaOfRectangle(double length,double breadth){
		double rectangleArea= length * breadth;
		System.out.println("Area of Rectagle with length " +length+ " and breadth " +breadth+ " is: "+rectangleArea);
	}
		
	void calculatePerimeterOfRectangle(double length,double breadth){
		double rectanglePerimeter= 2*(length + breadth);
		System.out.println("Perimeter of Rectagle with length " +length+ " and breadth " +breadth+ " is: "+rectanglePerimeter);
	}
	
	void calculateAreaOfCircle(double radius){
		double circleArea= 3.14 * radius * radius;
		System.out.println("Area of Circle with radius " +radius+ " is: "+circleArea);
	}
		
	void calculatePerimeterOfCircle(double radius){
		double circlePerimeter= 2 * 3.14 * radius;
		System.out.println("Perimeter of Circle with radius " +radius+ " is: "+circlePerimeter);
	}
	
	public static void main(String[] args){
		AreaPerimeter areaPerimeter= new AreaPerimeter();
		areaPerimeter.calculateAreaOfRectangle(5,6);
		areaPerimeter.calculatePerimeterOfRectangle(7,8);
		areaPerimeter.calculateAreaOfCircle(5);
		areaPerimeter.calculatePerimeterOfCircle(6);
	}
}