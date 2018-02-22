package pkgTest;

import static org.junit.Assert.*;
import org.junit.Test;
import pkgCore.Roll;

public class RollTest 
{

	@Test
	public void TestRoll()
	{

		for (int x = 0; x < 10000; x++) 
		{
			Roll r = new Roll();
			// TODO: Make sure value of roll is between 1 and 12.
			int[] rollValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
			assertEquals(rollValues, r.getScore());
		}

	}

}