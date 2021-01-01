/*Assignment : 44 [24th Dec'2020]

Program 1:
Find frequency of each word from the String
String str1 = "hello gm hi gm hello pune gn";*/

package himali.Assignment44;

import java.util.HashMap;



public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		String str1 = "hello gm hi gm hello pune gn";
		String[] array = str1.split(" ");
		int count = 0;
		for (String word : array) {
			if (map.containsKey(word)) {
				count = map.get(word);
				count++;
			} else {
				count = 1;
			}
			map.put(word, count);
		}

		for (String word : map.keySet()) {
			System.out.println(word + "-->" + map.get(word));
		}

	}

}
