import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void palindromeCheckTest() {
		Demo2 demo=new Demo2();
		//madam,mom,dad,malayalam
		assertTrue(demo.palindromeCheck("madam"));
		assertTrue(demo.palindromeCheck("mom"));
		assertTrue(demo.palindromeCheck("dad"));
		assertTrue(demo.palindromeCheck("malayalam"));
		assertFalse(demo.palindromeCheck("Madam"));
		System.out.println("Demo2 Tested Successfully");
	}

}
