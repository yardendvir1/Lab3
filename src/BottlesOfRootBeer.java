import java.util.Scanner;

public class BottlesOfRootBeer 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		boolean validAnswer = false;
		int amountBeers = 0;
		
		do
		{
			System.out.println("Enter number of root beer on wall");
			
			if (sc.hasNextInt() == true)
			{
				amountBeers = sc.nextInt();
				
				if (amountBeers > 0 && amountBeers < 100)
				{
					for (int i = amountBeers; i > 0; i--)
					{
						for (int j = i; j > 0; j--)
						{
							System.out.print("R");
						}
						System.out.println("");
					}
					System.out.println("NO MORE BOTTLES OF ROOT BEER ON THE WALL!");
					validAnswer = true;
				}
				else
				{
					validAnswer = false;
					System.out.println("Number must be > 0 and < 100");
				}
			}
			else
			{
				validAnswer = false;
				System.out.println("Enter an Integer!");
				sc.next();
			}
			
		}
		while (validAnswer == false);
	}
}
