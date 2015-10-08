import java.util.Random;

public class Dice 
{
	public Dice()
	{
	}
	
	
	public static int roll(int amount, Random rand)
	{
		int total = 0;
		
		for (int i = amount; i > 0; i--)
		{
			total += rand.nextInt(6) + 1;
		}
		
		return total;
	}
}
