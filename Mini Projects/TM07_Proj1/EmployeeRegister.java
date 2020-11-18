import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeRegister {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Number of Employees:");
		int noOfEmp= scan.nextInt();
		ArrayList<Employee> empList= new ArrayList<Employee>();
		for(int i=1;i<=noOfEmp;i++) {
			System.out.println("Enter Employee "+i+" Details:");
			System.out.println("Enter the Firstname");
			String firstName= scan.next();
			System.out.println("Enter the Lastname");
			String lastName= scan.next();
			System.out.println("Enter the Mobile");
			long number=scan.nextLong();
			System.out.println("Enter the Email");
			String mailId= scan.next();
			System.out.println("Enter the Address");
			String address=scan.next();
			empList.add(new Employee(firstName,lastName,number,mailId,address));
		}
		Collections.sort(empList);
		System.out.println("\nEmployee List:\n");
		System.out.printf("%-15s%-15s%-15s%-30s%-15s\n\n","FirstName","SecondName","MobileNumber","Email","Address");
		for(Employee e:empList) {
			System.out.printf("%-15s%-15s%-15s%-30s%-15s\n\n",e.firstName,e.lastName,e.number,e.mailId,e.address);
		}
		scan.close();
	}

}
