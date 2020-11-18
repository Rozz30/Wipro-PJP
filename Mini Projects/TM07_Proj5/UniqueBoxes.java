import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueBoxes {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Set<Box> set= new TreeSet<Box>();
		System.out.println("Enter the number of Box");
		int noOfBox= scan.nextInt();
		for(int i=1;i<=noOfBox;i++) {
			System.out.println("Enter the Box "+i+" details");
			System.out.println("Enter Length");
			double length= scan.nextDouble();
			System.out.println("Enter Width");
			double width= scan.nextDouble();
			System.out.println("Enter Height");
			double height=scan.nextDouble();
			Box box= new Box(length,width,height);
			set.add(box);
		}
		
		System.out.println("\nUnique Boxes in the Set are");
		for(Box b:set) {
			System.out.println(b);
		}
		scan.close();
	}

}
