package technoCredits.array;

public class RerverseArray {

	void printReserve(String[] arr) {
		for(int index=arr.length-1;index>=0;index--) {
			System.out.println(arr[index]);
		}
	}
	
	public static void main(String[] args) {
		String[] names = {"Apurva", "Pooja", "Nagendra", "Suresh", "Suvela", "Ankita"};
		RerverseArray rerverseArray = new RerverseArray();
		rerverseArray.printReserve(names);
	}
}
