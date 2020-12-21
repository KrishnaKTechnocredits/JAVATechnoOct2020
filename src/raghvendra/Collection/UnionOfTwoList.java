package raghvendra.Collection;
import java.util.ArrayList;
/*ArrayList<String> al1 = new ArrayList<String>();
al1.add("Maulik");
al1.add("Prasad");
al1.add("Krishna");
al1.add("Ritika");
al1.add("Suvela");
al1.add("Prasad");
ArrayList<String> al2 = new ArrayList<String>();
al2.add("Harsh");
al2.add("Krishna");
al1.add("Rahul");
al1.add("Prasad");
Hint : al2.removeAll(al1); al1.addAll(al2);
output : [Maulik, Prasad, Krishna, Ritika, Suvela, Harsh, Rahul]*/
public class UnionOfTwoList {
	static void unionOfTwoArrayList(ArrayList<String> list1CommonElement,ArrayList<String> list2CommonElement) {
		list2CommonElement.removeAll(list1CommonElement);
		list1CommonElement.addAll(list2CommonElement);
		System.out.println("Union of Above list elments:"+list1CommonElement);
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
		ArrayList<String> al11 = new ArrayList<String>();
		al11.add("Maulik");
		al11.add("Prasad");
		al11.add("Krishna");
		al11.add("Ritika");
		al11.add("Suvela");
		al11.add("Prasad");
		ArrayList<String> al22 = new ArrayList<String>();
		al22.add("Harsh");
		al22.add("Krishna");
		al22.add("Rahul");
		al22.add("Prasad");
		System.out.println(al11+"\n"+al22);
		UnionOfTwoList.unionOfTwoArrayList(UnionOfTwoList.removeDuplicates(al11), UnionOfTwoList.removeDuplicates(al22));
	}
}
