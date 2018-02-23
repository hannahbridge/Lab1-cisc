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
			// TODO: Make sure value of roll is between 2 and 12.
			if((r.getScore() > 1) && (r.getScore() < 13))
			{
				System.out.println("Test passed");
			}
			else
			{
				fail(r.getScore() + " must be between 2 and 12");
			}
		}

	}

}