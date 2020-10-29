import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class EmployeeTest {
	
	
	@Test
	public void findNameTest() {
		Employee emp=new Employee();
		ArrayList<String> employeeList=new ArrayList<String>();
			employeeList.add("Rozario");
			employeeList.add("Jaisankar");
			employeeList.add("Dhilip");
			employeeList.add("Akshaya");
			employeeList.add("Mamtha");
			employeeList.add("Jayasree");
		
		
		String result=emp.findName(employeeList, "Rozario");
		assertEquals("FOUND",result);
		System.out.println("Employee Tested Successfully");
	}

}
