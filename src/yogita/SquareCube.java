package yogita;

public class SquareCube{
    void calculateSquare(int num){
       int square = num * num;
	   System.out.println("Square of given Number is : " +square);
	}
	void calculateCube(int num){
       int cube = num * num * num;
	   System.out.println("Cube of given Number is : " +cube);
	}
		 
 public static void main(String [] arr){
       SquareCube squareCube = new SquareCube();
	   System.out.println("--------------Square ----------------");
	   squareCube.calculateSquare(4);
	   System.out.println("---------------Cube------------------");
       squareCube.calculateCube(5);	
    }
  }
