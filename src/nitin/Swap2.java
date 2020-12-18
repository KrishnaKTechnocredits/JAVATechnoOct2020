package nitin;
/* Assignment-20 : Program : 2 - swap 2 numbers without using 3rd variable */
public class Swap2 {
	public void swapWithoutVariable(int a,int b) {
		System.out.println("Before Swap --> A : "+a+" and B : "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap --> A : "+a+" and B : "+b);
	}
	public static void main(String[] args) {
		new Swap2().swapWithoutVariable(50,150);
	}
}
