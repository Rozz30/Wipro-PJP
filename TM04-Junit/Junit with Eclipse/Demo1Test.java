import static org.junit.Assert.*;
import org.junit.Test;

public class Demo1Test {
	
	@Test
	public void stringConcatTest() {
		Demo1 demo=new Demo1();
		assertEquals("TomCat",demo.stringConcat("Tom", "Cat"));
		System.out.println("Demo1 Tested Successfully");
	}
	

}
