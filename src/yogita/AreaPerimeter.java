package yogita;

public class AreaPerimeter{
	   float pi = 3.1416f;
	   
	void areaOfRectangle(float length, float width){
	   float area = length * width;
	   System.out.println("Area of Rectangle is:" +area);
	}
	
	void perimeterOfRectangle(float length , float width){
	   float perimeter = 2 * (length + width);
	   System.out.println("Perimeter of Rectangle is:"+perimeter);
    }
	
	void areaOfCircle(float radius){
	   float area = pi * radius * radius;
	   System.out.println("Area of Circle is:" +area);
	}
	
	void perimeterOfCircle(float radius){
	   float perimeter = 2 * pi * radius;
	   System.out.println("Perimeter of Circle is:"+perimeter);
	}
	
 public static void main(String [] arr){
	   AreaPerimeter areaPerimeter = new AreaPerimeter();
	   System.out.println("-----------Rectangle--------------");
	   areaPerimeter.areaOfRectangle(2,3);
	   areaPerimeter.perimeterOfRectangle(2,3);
	   System.out.println("------------Circle---------------");
       areaPerimeter.areaOfCircle(5);
	   areaPerimeter.perimeterOfCircle(5);
   }
 }