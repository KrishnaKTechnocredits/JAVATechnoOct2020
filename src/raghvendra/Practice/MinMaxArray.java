package raghvendra.Practice;
//1) find min and max number from array [expected time 15 mins]
public class MinMaxArray {
	void findMinMax(int[] arr) {
		int max=arr[0];
		int min=arr[0];
		for(int index=1;index<arr.length;index++) {
			if(max<arr[index])
				max=arr[index];
			if(min>arr[index])
				min=arr[index];
			}
		System.out.println("Maximun value is:" +max);
		System.out.println("Minimum value is:" +min);

	}
	public static void main(String[] args) {
		MinMaxArray minMaxArray=new MinMaxArray();
		int[] arr= {10,0,7,99,-5,18906,36,43,1,-2};
		minMaxArray.findMinMax(arr);

	}

}
