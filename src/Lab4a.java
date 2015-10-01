import java.util.Scanner;

public class Lab4a 
{
	public static int calculateUtil(int choice, int amount)
	{
		int util = 0;
		
		switch (choice)
		{
		case 1:
			util = buyIceCream(amount);
			break;
		case 2:
			util = stealIceCream(amount);
			break;
		case 3:
			util = 0;
			break;
		}	
		
		return util;
	}
	
	public static int buyIceCream(int amount)
	{
		return amount * 3;
	}
	
	public static int stealIceCream(int amount)
	{
		return amount * -5;
	}
	
	public static void printOptions()
	{
		System.out.println("(1) Buy people ice cream");
		System.out.println("(2) Steal ice cream from people");
		System.out.println("(3) Dream about people eating ice cream");
		System.out.println("(4) Die");
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int totalUtil = 0;
		boolean loop = true;
		
		System.out.print("Enter name > ");
		String name = sc.next();
		
		do
		{		
			printOptions();
			
			System.out.print("Enter next action of " + name + " > ");
			int option = sc.nextInt();
			
			int action = 0;
			
			if (option == 4)
			{
				loop = false;
			}
			else
			{
				System.out.print("How many people? > ");
				action = calculateUtil(option, sc.nextInt());
				totalUtil += action;
				System.out.println("This action caused " + action + " utils of hapiness.");
			}	
			

		}
		while (loop == true);
		
		System.out.println(name + " caused " + totalUtil + " utils of happiness.");
		
		String life = "";
		
		if (totalUtil == 0)
		{
			life = "neutral";
		}
		else if (totalUtil > 0)
		{
			life = "good";
		}
		else
		{
			life = "evil";
		}
			
		System.out.println("This was a morally " + life + " life.");
		
	}
}
