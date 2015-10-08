import java.util.Random;
import java.util.Scanner;

public class RollDice 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		Random rand = new Random();
		
		int[] values = new int[11];
		int times;
		
		System.out.print("How many times would you like to roll two dice? > ");
		times = sc.nextInt();
		
		for (int i = times; i > 0; i--)
		{
			values[Dice.roll(2, rand) - 2]++;
		}
		
		for (int i = 0; i < 11; i++)
		{
			System.out.println(i + 2 + ": \t" + values[i]);
		}
	}
}
