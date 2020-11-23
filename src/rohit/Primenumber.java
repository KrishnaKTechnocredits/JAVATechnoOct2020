package rohit;
//Print all prime numbers between 2 to 100.
public class Primenumber {

	void findprimenumbers(int start, int end) {
		if(start > end || start == end)
			System.out.println("Please enter correct range");
		else {
			for(int i=start;i<=end;i++) {
				boolean flag = true;
				for(int inner=2;inner<(i/2);inner++) {
					if(i%inner==0) {
						flag=false;
						break;
					}
				}
				if(flag)
					System.out.print(" "+i);
			}
		}
	}

	public static void main(String[] args) {
		Primenumber primenumber = new Primenumber();
		primenumber.findprimenumbers(2,100);
	}

}