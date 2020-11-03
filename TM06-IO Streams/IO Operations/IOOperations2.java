
/*Write a program to copy contents from one file to another and check the output.

Sample Input and Output:
Enter the input file name
Input.txt
Enter the output file name
Output.txt
File is copied.
*/


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOOperations2 {
	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input filename");
		String inFileName= scan.next();
		System.out.println("Enter the output filename");
		String outFileName= scan.next();
		File inFile = new File(inFileName);
		File outFile = new File(outFileName);
		BufferedReader br=new BufferedReader(new FileReader(inFile));
		BufferedWriter bw=new BufferedWriter(new FileWriter(outFile));
		int c;
		while((c=br.read())!=-1) {
			bw.write(c);
		}
		System.out.println("File Copied.");
		bw.close();
		br.close();
		scan.close();
	}
		
}
