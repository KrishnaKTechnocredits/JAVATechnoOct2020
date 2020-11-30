/*
   A) User can provide any positive and negative number
   B) You need to find out how many positive, negative numbers and zeros are there in array 

 */

package yogita;

class ArrayCount {
	int pCnt, nCnt, zCnt = 0;

	void findAllCount(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (num == 0)
				zCnt++;
			else if (num > 0)
				pCnt++;
			else if (num < 0)
				nCnt++;
		}
		System.out.println("Positive numbers are:" + pCnt);
		System.out.println("Negative Numbers are:" + nCnt);
		System.out.println("Zeros are:" + zCnt);
	}

	public static void main(String[] args) {
		ArrayCount arrayCount = new ArrayCount();
		int[] array = { 1, 2, 3, -2, 0, 8, -6, -3, 0 };
		arrayCount.findAllCount(array);
	}
}