package suresh;

public class MissingNumberArray {

	static int getMissingNo(int a[], int n) {
		int i, total;
		total = (n + 1) * (n + 2) / 2;
		for (i = 0; i < n; i++)
			total -= a[i];
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumberArray missingnumberarray = new MissingNumberArray();
		int a[] = { 1, 2,3, 4, 5, 6 ,7,8,9,11};
		int miss = getMissingNo(a, 9);
		System.out.println(miss);
	}

}
