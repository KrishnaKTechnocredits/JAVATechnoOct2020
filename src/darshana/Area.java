package darshana;
 public class Area{

	float pi = 3.1416f;
		
	void calculateAreaOfRecgtangle(int length, int width){
	int area = length * width;
	System.out.println("AREA OF RECTANGLE IS :" + area);
}

	void calculateAreaOfCircle(int radius){
	double area = pi * radius * radius;
	System.out.println("AREA OF CIRCLE :" + area);
	}
	
	void calculatePerimeterOfCirle(int radius){
	
	double perimeter = 2 * pi * radius;
	System.out.println("Perimeter of Circle :" + perimeter);
	}
	
	void calculatePerimeterOfRectangle(int length, int width){
	int perimeter= 2* length + 2 * width;
	System.out.println("PERIMETER OF RECTANGLE: "+ perimeter);
	}
	public static void main(String args[]){
	 Area area = new Area();
	 area.calculateAreaOfCircle(5);
	 area.calculateAreaOfRecgtangle(6,8);
	 area.calculatePerimeterOfRectangle(6,8);
	 area.calculatePerimeterOfCirle(6);
	
	}
	
	}