package suresh;

public class StringsIdentical {

		void identicalStringFinder() {
			/*String s1 = "technoCredits";
			String s2 = "teChnoCreditS";*/
			
			String s1 = "pune";
			String s2 = "pune";
			if(s1==s2) {
				System.out.println("Strings are Idential");
			}
			else
			System.out.println("Strings are not Identical");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringsIdentical stringidentical = new StringsIdentical();
		stringidentical.identicalStringFinder();

	}

}
