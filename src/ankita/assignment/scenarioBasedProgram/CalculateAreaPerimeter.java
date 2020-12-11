package ankita.assignment.scenarioBasedProgram;

public class CalculateAreaPerimeter {
	float circleOutput;
	float rectangleOutput;
	
	void calculateAreaOfCircle(float rad){
		System.out.println("\nCalculating Area of circle......");
		circleOutput = 3.14f * rad * rad;
		System.out.println("Area of circle = " + circleOutput);
	}
		void calculateAreaOfRectangle(float len, float wid){
		System.out.println("\nCalculating Area of rectangle......");
		rectangleOutput = len* wid;
		System.out.println("Area of rectangle = " + rectangleOutput);
	}
	void calculatePerimeterOfCircle(float rad){
		System.out.println("\nCalculating perimeter of circle.....");
		circleOutput =  2 * 3.1416f * rad;
		System.out.println("perimeter of circle = " + circleOutput);
	}
	void calculatePerimeterOfRectangle(float len, float wid){
		System.out.println("\nCalculating perimeter of rectangle.....");
		rectangleOutput = (2 * len ) + (2 * wid);
		System.out.println("Perimeter of rectangle = " + rectangleOutput);		
	}
	public static void main(String[] args){
		
		CalculateAreaPerimeter calculateAreaPerimeter = new CalculateAreaPerimeter();
		System.out.println("======================================================");
		calculateAreaPerimeter.calculateAreaOfCircle(5.0f);
		calculateAreaPerimeter.calculateAreaOfRectangle(6.2f,4.0f);
		calculateAreaPerimeter.calculatePerimeterOfCircle(5.0f);
		calculateAreaPerimeter.calculatePerimeterOfRectangle(6.2f,4.0f);
		System.out.println("\n======================================================");	
	}

}
