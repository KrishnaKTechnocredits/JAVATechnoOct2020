package nagendra.array;

public class FindCount {
	
	void getVisibleNumberCount(int[] input){
		int max=0;
		int count=0;
		for(int i=0;i<input.length;i++){
			if(input[i]>max){
				max=input[i];
				count++;
			}
		}
		System.out.println("Total Visible Tree:"+count);	
	}

	public static void main(String[] args) {
		FindCount count=new FindCount();
		int[] input={3,5,5,7,9,13,11,12};
		count.getVisibleNumberCount(input);
	}
}
