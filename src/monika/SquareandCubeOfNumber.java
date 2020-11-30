package monika;
class SquareandCubeOfNumber{

	 void square(int number){
			int square = number * number;
			System.out.println("Square of number is :" +square);
			
	}

    void cube(int number){
	       int cube = number * number * number;
			System.out.println("Cube of number is :" +cube);
			
	}

    public static void main(String[] args){
           SquareandCubeOfNumber squareAndcubeofnumber = new SquareandCubeOfNumber();
           squareAndcubeofnumber.square(3);
		   squareAndcubeofnumber.cube(3);
	}

}	
		   
			
          	