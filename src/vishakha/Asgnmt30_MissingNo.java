package vishakha;

public class Asgnmt30_MissingNo {

	public void findMissingNo(int[] input) {
		int sum=0;
		for(int index=0; index<input.length; index++) {
			sum+=input[index];
		}
		System.out.println("Missing Number is: "+(55-sum));
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,7,8,9,10};
		Asgnmt30_MissingNo missingNumber = new Asgnmt30_MissingNo();
		missingNumber.findMissingNo(arr);
	}
}