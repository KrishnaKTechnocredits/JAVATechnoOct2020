package brijesh;
class SquareCube{
	void square(int number){
		System.out.println("Square of "+number+" is: "+number*number);
	}
	void cube(int number){
		System.out.println("Cube of "+number+" is: "+number*number*number);
	}
	
	public static void main(String[] args){
		SquareCube squarecube = new SquareCube();
		squarecube.square(2);
		squarecube.cube(2);
	}
}