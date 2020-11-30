package surbhi;
class SqureAndCubeOfNumber{
	int squreOfNumber;
	int cubeOfNumber;
	void calculateSqure(int num){
		squreOfNumber = num*num;
		System.out.println("Squre is " + squreOfNumber);
	}
	void calcuateCube(int num){
		cubeOfNumber=num*num*num;
		System.out.println("Cube is " + cubeOfNumber);
	}
    public static void main(String[] arg){
		SqureAndCubeOfNumber squreAndCubeOfNumber = new SqureAndCubeOfNumber();
		squreAndCubeOfNumber.calculateSqure(4);
		squreAndCubeOfNumber.calcuateCube(3);
    }	
}