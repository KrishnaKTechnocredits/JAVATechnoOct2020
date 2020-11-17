package anjaliS;

public class AreaAndPerimeter{
	   float pi = 3.1416f;
	   
       void areaOfRectangle(int length, int width){
	   int area = length * width;
	   System.out.println("Area of Rectangle is:" +area);
     }
	   void perimeterOfRectangle(int length , int width){
	   int perimeter = 2 * (length + width);
	   System.out.println("Perimeter of Rectangle is:" +perimeter);
     }
	   void areaOfCircle(int radius){
	   float area = pi * radius * radius;
	   System.out.println("Area of Circle is:" +area);
    }
	   void perimeterOfCircle(int radius){
	   float perimeter = 2 * pi * radius;
	   System.out.println("Perimeter of Circle is:"+perimeter);
    }
    
       	public static void main (String[]args){
         AreaAndPerimeter areaperimeter = new AreaAndPerimeter();
         areaperimeter.areaOfRectangle(2,3);
         areaperimeter.perimeterOfRectangle(5,4);
         areaperimeter.areaOfCircle(4);
         areaperimeter.perimeterOfCircle(8);
   }
}
