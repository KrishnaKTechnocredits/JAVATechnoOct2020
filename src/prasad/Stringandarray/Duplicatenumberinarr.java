package prasad.Stringandarray;

public class Duplicatenumberinarr {
	
	void selectelement(int[]array) {
		for(int index=0;index<array.length;index++) {
			int number = array[index];
			scanarray(number,array);	
		}
	}
	
	void scanarray(int number,int[]arr) {
		int count=0;
		for(int index=0;index<arr.length;index++) {
			if(number==arr[index]&&arr[index]!=0) {
				arr[index]=0;
				count++;
			}
		}
		if(count>1) {
			System.out.println(number);
		}
	}
	
	public static void main(String[]arg) {
		Duplicatenumberinarr duplicatenumberinarr = new Duplicatenumberinarr();
		int []arry = {10,12,55,32,17,12,32};
		duplicatenumberinarr.selectelement(arry);
	}
}
