package pkgTest;

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
			assert r.getScore() == 1 || r.getScore() == 2 || r.getScore() == 3 || r.getScore() == 4 || r.getScore() == 5 || r.getScore() == 6 || r.getScore() == 7 || r.getScore() == 8 || r.getScore() == 9 || r.getScore() == 10 || r.getScore() == 11 || r.getScore() == 12;
		}

	}

}