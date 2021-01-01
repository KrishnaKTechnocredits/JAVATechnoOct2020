package anjaliS;

public class SquareAndCube{
      void calculateSquare(int num){
        int square = num * num;
         System.out.println("Square of given number is : " +square);
 	}
       void calculateCube(int num){
         int cube = num * num * num;
 	     System.out.println("Cube of given number is : " +cube);
 	}
 		 
       public static void main(String [] args){
         SquareAndCube squareandcube = new SquareAndCube();
 	     squareandcube.calculateSquare(4);
         squareandcube.calculateCube(5);	
     }
 }