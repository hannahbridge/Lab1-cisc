package pkgTest;

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
			assert d.getDieValue() == 1 || d.getDieValue() == 2 || d.getDieValue() == 3 || d.getDieValue() == 4 || d.getDieValue() == 5 || d.getDieValue() == 6;
		}
	}

}
