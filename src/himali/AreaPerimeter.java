package himali;
public class AreaPerimeter
{
	float pi=3.1416f;
		void calculateArea(float length,float width,float radius)
		{
			float areaOfRectangle=length*width;
			float areaOfCircle=pi*radius*radius;
			System.out.println("Area of Rectangle is : "+areaOfRectangle);
			System.out.println("Area of Circle is : "+areaOfCircle);
	
		}
		void calculatePerimeter(float length,float width,float radius)
		{
			float perimeterOfRectangle=2*length*width;
			float perimeterOfCircle=2*pi*radius;
			System.out.println("Perimeter of Rectangle is : "+perimeterOfRectangle);
			System.out.println("Perimeter of Circle is : "+perimeterOfCircle);
		
		}
		public static void main(String[] args)
		{
			AreaPerimeter areaperi=new AreaPerimeter();
			areaperi.calculateArea(2.0f,3.0f,2.0f);
			areaperi.calculatePerimeter(2.0f,3.0f,2.0f);
		}

}