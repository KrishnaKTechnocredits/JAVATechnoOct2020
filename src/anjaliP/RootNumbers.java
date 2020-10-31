package anjaliP;

public class RootNumbers {
	void squareRoot(int x) {
		System.out.println("-----------------Root Numbers----------------");
		int value = x*x;
		System.out.println("SqaureRoot of "+x+" is : "+value);
	}
	void cubeRoot(int y) {
		int value = y*y*y;
		System.out.println("CubeRoot of "+y+" is : "+value);
	}
	public static void main(String[] a) {
		RootNumbers rootnum =  new RootNumbers();
		rootnum.squareRoot(12);
		rootnum.cubeRoot(9);
	}
}
