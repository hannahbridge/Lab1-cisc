package pkgTest;

import static org.junit.Assert.*;
import org.junit.Test;
import pkgCore.Round;
import pkgCore.eGameResult;

public class RoundTest 
{
	@Test
	public void test()
	{
		for(int x=0; x<10000; x++)
		{
			Round nextRound = new Round();
			System.out.println(nextRound.displayRolls());
			
			if((nextRound.RollCount() == 1) && ((nextRound.getFirstScore() == 7) || (nextRound.getFirstScore() == 11)))
			{
				assertEquals(eGameResult.NATURAL, nextRound.geteGameResult());
			}
			if((nextRound.RollCount() == 1) && ((nextRound.getFirstScore() == 2) || (nextRound.getFirstScore() == 3) || (nextRound.getFirstScore() == 12)))
			{
				assertEquals(eGameResult.CRAPS, nextRound.geteGameResult());
			}
			if((nextRound.RollCount() >= 2) && (nextRound.getFirstScore() == nextRound.getLastScore()))
			{
				assertEquals(eGameResult.POINT, nextRound.geteGameResult());
			}
			if((nextRound.RollCount() >= 2) && (nextRound.getLastScore() == 7))
			{
				assertEquals(eGameResult.SEVEN_OUT, nextRound.geteGameResult());
			}
		}
	}
}
