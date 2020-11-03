package ruby;

//Calcuate the Area and Perimeter of Rectangle and Circle
class CalculateArea{
	void rectangleArea(int length, int width){	
		System.out.println("  Area of Rectangle is "+ (length * width));
	}
	void circleArea(double radius){	
		System.out.println("  Area of Circle is "+ (3.1416*radius*radius));
	}
	void rectanglePerimeter(int length, int width){
		System.out.println("  Perimeter of Rectangle is "+ (2*length + 2*width));
	}
	void circlePerimeter(double radius){
		System.out.println("  Perimeter of Circle is "+ (2*3.1416*radius));
	}	
	public static void main(String[] a){
		CalculateArea calcuate = new CalculateArea();
		calcuate.rectangleArea(50,52);
		calcuate.rectanglePerimeter(52,50);
		calcuate.circleArea(3);
		calcuate.circlePerimeter(5);
	}
}

