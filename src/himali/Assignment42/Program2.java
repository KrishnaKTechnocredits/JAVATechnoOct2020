

/*Program 2: Union of two list, return a list having all element one time*/

package himali.Assignment42;

import java.util.ArrayList;

public class Program2 {

	ArrayList<String> findUnion(ArrayList<String> al){
		for(int i=0;i<al.size();i++){
			String temp=al.get(i);
			if(al.indexOf(temp)!=al.lastIndexOf(temp)){
				al.remove(temp);
			}
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program2 union =new Program2();
		ArrayList<String> arraylist1 = new ArrayList<String>();
		arraylist1.add("Maulik");
		arraylist1.add("Prasad");
		arraylist1.add("Krishna");
		arraylist1.add("Ritika");
		arraylist1.add("Suvela");
		arraylist1.add("Prasad");

		ArrayList<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("Harsh");
		arraylist2.add("Krishna");
		arraylist2.add("Rahul");
		arraylist2.add("Prasad");
		
		arraylist1=union.findUnion(arraylist1);
		arraylist2.removeAll(arraylist1);
		arraylist1.addAll(arraylist2);
		System.out.println(arraylist1);
	}
}


