package math.operation;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import math.operation.ArithmaticOperation;

public class ArithmaticOperationTest 
{
	@Test		
	public void addTest()
	{
		ArithmaticOperation  ao = new ArithmaticOperation();
		Integer actual = ao.add(2, 6);
		Integer expected = 9;
		assertEquals(expected, actual);
	}
}
