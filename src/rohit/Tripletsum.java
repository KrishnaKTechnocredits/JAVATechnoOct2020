package rohit;
//To find sum from the maximum triplet.
public class Tripletsum {

	public static void triplet(int [] arrnum) {
		int j=0;
		int index = 0 ;
		for (int i = 0 ; i < arrnum.length;i += 3 ) {
			int sum = arrnum[i]+arrnum[i+1]+arrnum[i+2];
			if (sum > j) {
			    j = sum;
				index=i;
			}
		}	
		System.out.println("Triplets with maximum values -  "+arrnum[index]+","+arrnum[index+1]+","+arrnum[index+2]+" And their sum is - "+j);
	}

	public static void main(String[] args) {
		int [] num = {10,12,8,20,18,22,15,13,17};
		Tripletsum.triplet(num);
	}

}