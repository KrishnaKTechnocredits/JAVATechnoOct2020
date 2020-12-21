package nandini.constructorProgs;

public class Square {

   int side;	
	Square(int side){
		this.side=side;		
	}
	void getArea(){
		System.out.println("Area of square is "+(side * side));		
	}
	public static void main(String args[]) {
		Square sqr = new Square(8);
		sqr.getArea();
	}
}
