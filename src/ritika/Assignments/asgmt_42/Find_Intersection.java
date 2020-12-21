package ritika.Assignments.asgmt_42;

/* Assignment_42 : 20 Dec 2020
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

Program 1 : Retains all common elements between both list.
Hint : al1.retainsAll(al2);
output : [Prasad, Krishna]

Program 2: Union of two list, return a list having all element one time.
Hint : al2.removeAll(al1); al1.addAll(al2);

output : [Maulik, Prasad, Krishna, Ritika, Suvela, Harsh, Rahul]
*/
import java.util.ArrayList;

public class Find_Intersection {

	void findIntersection(ArrayList<String> al1, ArrayList<String> al2) {
		for (int i = 0; i < al1.size(); i++) {
			String temp = al1.get(i);
			while (al1.indexOf(temp) != al1.lastIndexOf(temp)) {
				al1.remove(al1.lastIndexOf(temp));
			}
		}
		al1.retainAll(al2);
		System.out.println("Intersection of both lists is:");
		System.out.println(al1);
	}

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Maulik");
		al1.add("Prasad");
		al1.add("Krishna");
		al1.add("Ritika");
		al1.add("Suvela");
		al1.add("Prasad");
		al1.add("Prasad");
		al1.add("Ritika");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Harsh");
		al2.add("Krishna");
		al2.add("Rahul");
		al2.add("Prasad");
		al2.add("Krishna");

		Find_Intersection findIntersection = new Find_Intersection();
		findIntersection.findIntersection(al1, al2);
	}
}
