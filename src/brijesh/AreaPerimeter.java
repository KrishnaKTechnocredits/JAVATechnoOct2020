package brijesh;
class AreaPerimeter{
	final float pi =3.1416f;
	void rectangleArea(int width, int length){
		System.out.println("Rectangle Area: "+width*length);
	}
	void rectanglePerimeter(int width, int length){
		System.out.println("Rectangle Perimeter: "+(2*width+2*length));
	}
	void circleArea(int radius){
		System.out.println("Circle Area: "+pi*radius*radius);
	}
	void circlePerimeter(int radius){
		System.out.println("Circle Perimeter: "+2*pi*radius);
	}
	public static void main(String[] args){
		AreaPerimeter areaPerimeter = new AreaPerimeter();
		areaPerimeter.rectangleArea(10,20);
		areaPerimeter.rectanglePerimeter(10,20);
		areaPerimeter.circleArea(10);
		areaPerimeter.circlePerimeter(10);
	}
}