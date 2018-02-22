package pkgTest;

import static org.junit.Assert.*;
import org.junit.Test;
import pkgCore.Die;

public class DieTest 
{

	@Test
	public void TestDie() 
	{

		for (int x = 0; x < 10000; x++) 
		{
			Die d = new Die();
			// TODO: Make sure value of die is between 1 and 6.
			int[] dieValues = {1, 2, 3, 4, 5, 6};
			assertEquals(dieValues, d.getDieValue());
		}

	}

}
