package nitin;
/*Assignment-19 : Program : 2 - Reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}*/
import java.util.Arrays;
public class ReverseArray {
	public void arrayReverse(String[] word) {
		for(int index=word.length-1;index>=0;index--) {
			System.out.print(word[index]+" ");
		}
	}
	public static void main(String[] args) {
		String[] arr={"Credits", "Techno","From","Diwali","Happy"};
		System.out.println("Input Array : "+Arrays.toString(arr));
		System.out.print("Output Array in reverse Order : ");
		new ReverseArray().arrayReverse(arr);
	}
}
