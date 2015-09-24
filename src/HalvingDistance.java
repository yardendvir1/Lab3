
public class HalvingDistance 
{
	public static void main(String[] args)
	{
		double helenPosition = 0.0;
		double parisPosition = 10.0;
		int amountSteps = 0;
		
		do
		{
			parisPosition = parisPosition / 2;
			amountSteps++;
		}
		while (helenPosition != parisPosition);
		
		System.out.println("It took Paris " + amountSteps + " steps to get to Helen!");
		
	}
}
