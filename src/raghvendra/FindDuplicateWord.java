package raghvendra;
/*String[] names = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
output : Techno
         Hi*/
public class FindDuplicateWord {
	void SearchDuplicate(String[] names) {
		String[] outerString=new String[names.length];
		int count=0;
		for(int index=1;index<names.length;index++) {
			outerString[index]=names[index];
			count=0;
			if(names[index]!="") {
				for(int inner=0;inner<names.length;inner++) {
					if(outerString[index].equalsIgnoreCase(names[inner])) {
						count++;
						names[inner]="";
					}
				}
			if(count>1) 
			System.out.println("Duplicate numbers are: "+outerString[index]);
			}
		}
	}

	public static void main(String[] args) {
		FindDuplicateWord findDuplicateWord=new FindDuplicateWord();
		String[] names = {"Techno", "Credits","Techno","Hi","Hello","Hi"};
		findDuplicateWord.SearchDuplicate(names);
	}
}
