package apurva;

class AreaPera{
	int radius = 2;
	double area;
	float pi = 3.1416f;
	float perimeter;
	float length = 3;
	float width = 5;
	
	void areaOfCircle(){
		area = pi*radius*radius;
		System.out.println("Area of circle is = " + area);
	}

	void areaOfRectangle(){
		area = length*width;
		System.out.println("Area of rectangle is = " + area);
	}

	void perimeterOfCircle(){
		perimeter = 2*pi*radius;
		System.out.println("Perimeter of circle is = " + perimeter);
	}

	void perimeterOfRectangle(){
		perimeter = 2*length + 2*width;
		System.out.println("Perimeter of rectangle is = " + perimeter);
	}

	public static void main(String[] args){
		AreaPera areapera = new AreaPera();
		areapera.areaOfCircle();
		areapera.areaOfRectangle();
		areapera.perimeterOfCircle();
		areapera.perimeterOfRectangle();
	}
}