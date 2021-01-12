/*Assignment 49 :
1) Read file and print frequency of "Technocredits" word in each line.

	File content: This is Technocredits.
                  Technocredits java selenium batch is running.
                  Technocredits new batch is API Automation Technocredits batch.
 */

package kajol.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
	
	static void  findFrequency(BufferedReader br)  throws IOException {
		String line="";
		int totalFrequency=0;
		while((line=br.readLine())!=null) {
			if (line.contains("Technocredits")){
				int frequency=0;
				String [] str=line.split(" ");
				for(int index=0;index<str.length;index++) {
					if(str[index].equals("Technocredits")) {
						frequency++;
						totalFrequency++;
					}
				}
				System.out.println(line);
				System.out.println("Frequency of 'Technocredits' in above line is : "+frequency);
				System.out.println();
			}
		}
		System.out.println("Total Frequency of 'Technocredits' in File : "+totalFrequency);
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("./src/kajol/fileHandling/readme.txt"));
		findFrequency(br);
	}
}
