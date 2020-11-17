package brijesh.assignment21;

public class Identical {
	
	boolean isIdential(int[] numberArr1, int numberArr2[]) {
		if(numberArr1.length == numberArr2.length) {
			for(int index=0; index<numberArr1.length; index++) {
				if(numberArr1[index]!=numberArr2[index])
					return false;
			}
		}else
			return false;
		return true;
	}

	public static void main(String[] args) {
		int[] numberArr1 = {10,12,55,32,17};
		int[] numberArr2 = {10,12,55,32,31};
		System.out.println("Are arrays identical: "+new Identical().isIdential(numberArr1, numberArr2));
	}
}
