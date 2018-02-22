package pkgCore;

public class Roll 
{
	private Die d1;
	private Die d2;
	private byte Score;

	public Roll() 
	{
		// TODO: Create an instance of d1 and d2...
		d1 = new Die();
		d2 = new Die();
		
		// TODO: Determine 'Score'
		Score = (byte) (d1.getDieValue() + d2.getDieValue());
	}

	public byte getScore() 
	{
		return Score;
	}
}
