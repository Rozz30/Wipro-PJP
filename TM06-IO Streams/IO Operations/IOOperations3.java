/*Write a program to count the occurrences of each word in an input file and write the word along with its corresponding count in an output file.

[Note: The words should be sorted alphabetically in the output file]

(Hint : Consider using Map Collection)

For Example, let's assume the following are the contents of inputFile.txt

Manoj works at Wipro
Katari works at Wipro
Sureka works at Wipro
Harish works at Wipro
Anitha works at Wipro
Janani works at Wipro

D:\>Java FileWordCount inputFile.txt outputFile.txt

After Execution of the program the contents of outputFile.txt should be as below

Anitha : 1
Harish : 1
Janani : 1
Katari : 1
Manoj : 1
Sureka : 1
Wipro : 6
at : 6
works : 6*/


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class IOOperations3 {

	public static void main(String[] args) throws IOException {
		String inFileName= args[0];
		String outFileName= args[1];
		File inFile=new File(inFileName);
		File outFile=new File(outFileName);
		BufferedReader br= new BufferedReader(new FileReader(inFile));
		BufferedWriter bw=new BufferedWriter(new FileWriter(outFile));
		Map<String,Integer> map=new TreeMap<String, Integer>();
		String line;
		while((line=br.readLine())!=null) {
			String[] words =line.trim().split(" ");
			for(String word:words) {
				if(!map.containsKey(word)) {
					map.put(word, 1);
				}else {
					map.put(word, map.get(word)+1);
				}
			}
		}
		System.out.println(map);
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			bw.write(entry.getKey()+":"+entry.getValue()+"\n");
		}
		bw.close();
		br.close();
		
		
	}

}
