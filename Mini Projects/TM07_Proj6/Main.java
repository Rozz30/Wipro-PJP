import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringOperations so=new StringOperations();
		System.out.print("S1=");
		String s1=scan.next();
		System.out.print("S2=");
		String s2= scan.next();
		ArrayList<StringBuilder> list=new ArrayList<StringBuilder>();
		list.add(so.firstOp(s1, s2));
		list.add(so.secondOp(s1,s2));
		list.add(so.thirdOp(s1, s2));
		list.add(so.fourthOp(s1, s2));
		list.add(so.fifthOp(s1, s2));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(i+1+". "+list.get(i));
		}
		
		System.out.println("\nOutput:"+list);
		scan.close();

	}

}
