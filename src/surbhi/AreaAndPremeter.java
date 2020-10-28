package surbhi;
class AreaAndPerimeter{
	
	    float pi=3.14f;
		void calculateAreaOfCircle(float r){
			float areaofCircle = pi*r*r;
			System.out.println("Area Of circle " + areaofCircle);
		}
		void calcualteAreaofRectengle(float lenght, float width){
			float areaofRectengle= lenght * width;
			System.out.println(" Area of rectengle " +areaofRectengle );
		}
		void perimeterOfCircle(float radius){
			float PeriofCircle= 2*pi*radius;
			System.out.println("Perimeter of Circle" + PeriofCircle);
		}
		void perimeterofRectengle(float lenght, float width){
			float periOfRectengle = 2*lenght +2*width;
			System.out.println("Perimeter of Rectengle " + periOfRectengle);
		}
		public static void main(String[] args){
			   AreaAndPerimeter areaAndPerimeter = new AreaAndPerimeter();
			   areaAndPerimeter.calculateAreaOfCircle(3);
			   areaAndPerimeter.calcualteAreaofRectengle(5,6);
			   areaAndPerimeter.perimeterOfCircle(5);
			   areaAndPerimeter.perimeterofRectengle(5,6);
			
		}
}