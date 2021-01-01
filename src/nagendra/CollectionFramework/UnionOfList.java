package nagendra.CollectionFramework;
import java.util.ArrayList;

/*
Program 2: Union of two list, return a list having all element one time.
*/

public class UnionOfList {
	
	ArrayList<String>  findUnionOfArray(ArrayList<String> al){
		for(int i=0;i<al.size();i++){
			String temp=al.get(i);
			if(al.indexOf(temp)!=al.lastIndexOf(temp)){
				al.remove(temp);
			}
		}
		return al;
	}

	public static void main(String[] args) {
		UnionOfList list=new UnionOfList();
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Maulik");
		list1.add("Prasad");
		list1.add("Krishna");
		list1.add("Ritika");
		list1.add("Suvela");
		list1.add("Prasad");
				
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Harsh");
		list2.add("Krishna");
		list1.add("Rahul");
		list1.add("Prasad");
		list1=list.findUnionOfArray(list1);
		list2.removeAll(list1);
		list1.addAll(list2);
		System.out.println(list1);
	}
}
