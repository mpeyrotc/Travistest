import org.junit.Assert;
import org.junit.Test;

public class CustomClassTest {
	@Test
	public void testEven() {
		Assert.assertTrue(CustomClass.isEven(4));
		Assert.assertFalse(CustomClass.isEven(7));
	}

	@Test
	public void testInRange() {
		Assert.assertTrue(CustomClass.inRange("0"));
		Assert.assertFalse(CustomClass.inRange("-1"));
		Assert.assertTrue(CustomClass.inRange("9"));
		Assert.assertFalse(CustomClass.inRange("10"));
	}
	
	@Test(expected = NumberFormatException.class)
	public void testInRangeBadArgument() {
		CustomClass.inRange("not a number");
	}
}
