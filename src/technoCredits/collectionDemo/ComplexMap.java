package technoCredits.collectionDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class ComplexMap {

	public static void main(String[] args) {
		Map<String, TreeSet<String>> stateCityMap = new HashMap<String, TreeSet<String>>();
		TreeSet<String> gujCities = new TreeSet<String>();
		gujCities.add("Surat");
		gujCities.add("Bharuch");
		gujCities.add("Rajkot");
		stateCityMap.put("Guj", gujCities);
		
		TreeSet<String> temp = stateCityMap.get("Guj");
		System.out.println(temp);
		
		
		ArrayList<String> excelList = new ArrayList<String>(temp);
		ArrayList<String> uiDropdownList = new ArrayList<String>();
		
		System.out.println(excelList.equals(uiDropdownList));
		/*int count = 0;
		ArrayList<String> al = new ArrayList<String>();
		for(String t1 : temp) {
			t1.equals(al.get(count++));
		}*/
	}
}
