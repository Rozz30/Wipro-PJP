import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOOperations1{
	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(new InputStreamReader(System.in));
		System.out.println("Enter the file name");
		String filename= scan.next();
		System.out.println("Enter the character to be counted");
		char character =scan.next().charAt(0);
		
		
		File file=new File(filename);
		BufferedReader br=new BufferedReader(new FileReader(file));
		int count=0;
		int chRetVal;
		do {
			chRetVal=br.read();
			if(chRetVal>=65 && chRetVal<=90) {
				chRetVal+=32; /// converting capital letters to small letters (A=65; A+32=97 which is a.)
			}
			if (character == chRetVal) {
				count+=1;
			}
		}while(chRetVal!=-1);// read() returns -1 if end of stream.
		System.out.println("File \'"+filename+"\' has "+count+" instances of \'"+character+"\'");
		br.close();
	}
}