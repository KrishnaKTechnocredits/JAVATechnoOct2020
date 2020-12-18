package prasad.Stringandarray;
/*Program 2: print Hi when you find 3 consecutive numbers.
1,2,3,5,8,9,11,12,13,14,15,18,19,20
output :1,2,3 -> Hi
11,12,13 -> Hi
12,13,14 -> Hi
13,14,15 -> Hi
18,19,20 -> Hi*/

public class IndentifyThreeConsecutiveNos {
	
	void findConsecutive(int[]array) {
		for(int i=0,j=1,k=2;i<array.length-2;i++,j++,k++) {
			int diff=0;
			int diff1=0;
			diff=array[j]-array[i];
			diff1=array[k]-array[j];
			if(diff==1 && diff1==1) {
				System.out.println(array[i]+ ","+ array[j]+ ","+array[k] + " -> " + "Hi ");
			}
		}
}
	
	public static void main(String[]arg) {
		IndentifyThreeConsecutiveNos indentifythreeconsecutivenos = new IndentifyThreeConsecutiveNos();
		int[]input = {1,2,3,5,8,9,11,12,13,14,15,18,19,20};
		System.out.println("Three consecutive numbers in given array:-");
		indentifythreeconsecutivenos.findConsecutive(input);
	}
}
