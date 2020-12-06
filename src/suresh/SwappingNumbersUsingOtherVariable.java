package suresh;

public class SwappingNumbersUsingOtherVariable {

		void swapNumbersWithTemp(int x,int y) {
			int temp=x;
			x=y;
			y=temp;
			System.out.println("========Swapping Numbers using Temp=========");
			System.out.println("X Value is: "+x);
			System.out.println("Y Value is: "+y);
			
		}
		void swapStringWithTemp() {
			String firstname ="Suresh";
			String lastname ="Kumar";
			String Name = firstname;
			firstname = lastname;
			lastname = Name;
			System.out.println("========Swapping String using Temp=========");
			System.out.println("firstname  is: "+firstname);
			System.out.println("lastname  is: "+lastname);
		}
		void swapStringWithOutUsingTemp() {
			String firstname ="Suresh";
			String lastname ="Kumar";
			String substr = "";
			substr = firstname.substring(0, 6);
			System.out.println("Last Name = " + substr);
			substr = lastname.substring(0, 5);
			System.out.println("first Name = " + substr);
		}
		void swapNumbersWithOutTemp(int x,int y) {
			
			x=x^y;
			y=x^y;
			x=x^y;
			System.out.println("========Swapping Numbers with out using Temp=========");
			System.out.println("X Value is: "+x);
			System.out.println("Y Value is: "+y);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwappingNumbersUsingOtherVariable swappingnumber = new SwappingNumbersUsingOtherVariable();
		swappingnumber.swapNumbersWithTemp(10, 20);
		swappingnumber.swapNumbersWithOutTemp(10, 20);
		swappingnumber.swapStringWithTemp();
		swappingnumber.swapStringWithOutUsingTemp();
		
	}

}
