package anurag;

public class RectangleCircle {
	

		//float area;
		//float perimeter;
		
		void displayRectangle(float l, float b){
		 float area1 = l*b;
		 float perimeter1 = 2*(l+b);
		  System.out.println("Area of Rectangle :" +area1);
		  System.out.println("Perimeter of Rectangle :" +perimeter1);
		}
		
		void displayCircle(float r){
		  float area2=3.14f*r*r;
		  float perimeter2 = 2*3.14f*r;
		  System.out.println("Area of circle :" +area2);
		  System.out.println("Perimeter of circle :" +perimeter2);
		}
		
		public static void main(String[] args){
		  RectangleCircle rectangleCircle1 = new RectangleCircle();
		  rectangleCircle1.displayRectangle(5.5f,6.5f);
		  rectangleCircle1.displayCircle(10.5f);
		}
	}



		
		
		
		


