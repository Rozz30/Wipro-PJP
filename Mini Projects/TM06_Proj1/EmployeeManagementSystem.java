import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class EmployeeManagementSystem {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner scan=new Scanner(System.in);
		int choice;
		int noOfObjects = 0;
		
		FileOutputStream fos=new FileOutputStream("ems.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		FileInputStream fis=new FileInputStream("ems.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		do {
			Employee emp=new Employee();
			System.out.println("Main Menu");
			System.out.println("1. Add an Employee");
			System.out.println("2. Display all");
			System.out.println("3. Exit");
			choice= scan.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter Employee ID: ");
				emp.setEmpId(scan.next());
				System.out.print("Enter Employee Name: ");
				emp.setName(scan.next());
				System.out.print("Enter Employee Age: ");
				emp.setAge(scan.nextInt());
				System.out.print("Enter Employee Salary: ");
				emp.setSalary(scan.nextDouble());
				oos.writeObject(emp);
				noOfObjects++;
				break;
			case 2:
				for(int i=1;i<=noOfObjects;i++) {
					System.out.println(i);
				}
				System.out.println("------ Report -----");
				while(fis.available()>0) {
					emp= (Employee) ois.readObject();
					System.out.println(emp.toString());
				}
				noOfObjects=0;
				System.out.println("---End of Report---");
				break;
			case 3:
				System.out.println("Exiting... Thanks for using the application!");
				oos.close();
				ois.close();
				scan.close();
			}
			
		}while(choice!=3);
	}

}
