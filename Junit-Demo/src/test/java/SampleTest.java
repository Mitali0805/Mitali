import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SampleTest {
	
	@Test
 public void simplePass()
 {
	 int a=1;
	 int b=2;
	 assertTrue(a+b ==3);
 }	
	@Test
 public void simpleFail()
 {
	 int a=2;
	 int b=2;
	 assertTrue(a+b ==4);
 }	
}
