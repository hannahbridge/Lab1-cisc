package pkgCore;
import java.util.LinkedList;

public class Round 
{

	private byte ComeOutScore;
	@SuppressWarnings("unused")
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() 
	{
		// TODO: Execute Come Out roll, value ComeOutScore
		// Come Out roll = initial roll
		Roll ComeOutRoll = new Roll();
		ComeOutScore = ComeOutRoll.getScore();
	
		rolls.add(ComeOutRoll);
		
		if(ComeOutScore == 7 || ComeOutScore == 11)
		{
			this.eGameResult =  pkgCore.eGameResult.NATURAL;
		}
		if(ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) 
		{
			this.eGameResult = pkgCore.eGameResult.CRAPS;
		}

		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out
		boolean isPointOrSevenOut = false;
		Roll nextRoll;
		
		if(ComeOutScore == 4 || ComeOutScore == 5 || ComeOutScore == 6 || ComeOutScore == 8 || ComeOutScore == 9 || ComeOutScore == 10)
		{
			while(isPointOrSevenOut == false)
				{
					nextRoll = new Roll();
					rolls.add(nextRoll);
				
					if(nextRoll.getScore() == ComeOutScore)
					{
						this.eGameResult = pkgCore.eGameResult.POINT;
					}
					if(nextRoll.getScore() == 7)
					{
						this.eGameResult = pkgCore.eGameResult.SEVEN_OUT;
						isPointOrSevenOut = true;
					}
				}
		}
			
		// TODO: value the eGameResult after the round is complete
	}

	public int RollCount() 
	{
		// Return the roll count
		return rolls.size();
	}

}