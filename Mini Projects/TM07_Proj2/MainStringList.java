import java.util.Scanner;

public class MainStringList {

	public static void main(String[] args) {
		StringList obj=new StringList();
		Scanner scan=new Scanner (System.in);
		int choice;
		do {
			System.out.println("\n1.Insert\n2.Search\n3.Delete\n4.Display\n5.Exit");
			System.out.println("Enter your choice:");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the item to be inserted:");
				obj.insert(scan.next());
				break;
			case 2:
				System.out.println("Enter the item to search:");
				obj.search(scan.next());
				break;
			case 3:
				System.out.println("Enter the item to delete:");
				obj.delete(scan.next());
				break;
			case 4:
				System.out.println("Items in the list are:");
				obj.display();
				break;
			case 5:
				System.out.println("Exiting... Thanks for using the application!");
			}
		}while(choice!=5);
		scan.close();
	}

}
