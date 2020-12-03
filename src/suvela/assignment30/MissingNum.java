package suvela.assignment30;

public class MissingNum {
	void findNum(int[] array) {
		int sum=0;
		int number=0;
		int length=array.length;
		int arraySum=(length+1)*(length+2)/2;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
				number=arraySum-sum;
				System.out.println("Missing number is :"+number);
		
	}
	public static void main(String[] args) {
		int[] array= {1,3,8,5,9,2,10,7,6};
		MissingNum mn= new MissingNum();
		mn.findNum(array);
	}

}
