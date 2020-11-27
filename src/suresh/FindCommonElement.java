package suresh;

public class FindCommonElement {
	
	void commonElementinArray() {
		int[] numArray1 = {1, 2, 5, 5, 8, 9, 7, 10};
		  int[] numArray2 = {1, 0, 6, 15, 6, 4, 7, 0};
		  // Outer loop
		  for(int i = 0; i < numArray1.length; i++){
		   for(int j = 0; j < numArray2.length; j++){// inner loop
		    if(numArray1[i] == numArray2[j]){
		     System.out.println(numArray1[i]);
		     break;
		    }
		   }
		  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindCommonElement commonelement = new FindCommonElement ();
		commonelement.commonElementinArray();
	}

}
