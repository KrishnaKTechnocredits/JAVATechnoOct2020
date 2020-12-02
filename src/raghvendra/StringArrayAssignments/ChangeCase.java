package raghvendra.StringArrayAssignments;
/*convert all capital letters to small and small to capitial.

String msg = "tE1GfrEsT";
output : Te1gFReSt

Hint : isUpperCase(), isLowerCase(), toUpperCase(), toLowerCase()*/
public class ChangeCase {
	void changeCaseString(String st) {
		String store="";
		for(int index=0;index<st.length();index++) {
			char ch=st.charAt(index);
			if(Character.isLetter(ch))
				if(Character.isUpperCase(ch))
					store+=Character.toLowerCase(ch);
				else
					store+=Character.toUpperCase(ch);
			else
				store+=ch;
		}
		System.out.println("Original String: "+st+" String after case conversion: "+store);
	}

	public static void main(String[] args) {
		ChangeCase changeCase=new ChangeCase();
		String st="tE1GfrEsT";
		changeCase.changeCaseString(st);
		String st1="334aBCguPTa12";
		changeCase.changeCaseString(st1);
	}
}
