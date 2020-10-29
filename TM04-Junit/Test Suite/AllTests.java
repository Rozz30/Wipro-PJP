/*Create a test suite for all the classes created in this tech module and execute the same*/

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Demo1Test.class, EmployeeTest.class, Demo2Test.class })
public class AllTests {
	
}
