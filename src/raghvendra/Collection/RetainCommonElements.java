package raghvendra.Collection;
import java.util.ArrayList;
/*Program 1 : Retains all common elements between both list.
ArrayList<String> al1 = new ArrayList<String>();
al1.add("Maulik");
al1.add("Prasad");
al1.add("Krishna");
al1.add("Ritika");
al1.add("Suvela");
al1.add("Prasad");
ArrayList<String> al2 = new ArrayList<String>();
al2.add("Harsh");
al2.add("Krishna");
al2.add("Rahul");
al2.add("Prasad");
Hint : al1.retainsAll(al2); 		
output : [Prasad, Krishna]*/
public class RetainCommonElements {
	static void displayCommonElements(ArrayList<String> list1CommonElement,ArrayList<String> list2CommonElement) {
		list1CommonElement.retainAll(list2CommonElement);
		System.out.println("Common elements in list are "+list1CommonElement);
	}
	
	public static ArrayList<String> removeDuplicates(ArrayList<String> list1CommonElement) {
		for(int index=0;index<list1CommonElement.size();index++) {
			String word=list1CommonElement.get(index);
			int firstIndex=list1CommonElement.indexOf(word);
			int lastIndex=list1CommonElement.lastIndexOf(word);
			if(firstIndex!=lastIndex) {
				list1CommonElement.remove(lastIndex);
			}
		}
		return list1CommonElement;
	}
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Maulik");
		al1.add("Prasad");
		al1.add("Krishna");
		al1.add("Ritika");
		al1.add("Suvela");
		al1.add("Prasad");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Harsh");
		al2.add("Krishna");
		al2.add("Rahul");
		al2.add("Prasad");
		System.out.println("List1 "+al1+" "+"\n List2 "+al2);
		RetainCommonElements.displayCommonElements(RetainCommonElements.removeDuplicates(al1),RetainCommonElements.removeDuplicates(al2));
	}
}
