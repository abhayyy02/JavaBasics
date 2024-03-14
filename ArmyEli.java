import java.util.Scanner;
class ArmyEli
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your AGE :");
		byte age = sc.nextByte();

		if(age>=18)
		{
			System.out.println("Enter your Height in CM ");
			float height = sc.nextFloat();

			if(height>=162)
			{
				System.out.println("Enter your Weight ");
				float weight = sc.nextFloat();

				if(weight>=56)
				{
					System.out.println("Congratulations. YOU ARE SELECTED FOR ARMY :-) ");
				}

				else
				{
					System.out.println("Sorry, you cannot join ARMY due to less Weight ");
				}
			}
			else 
			{
				System.out.println("Sorry, you cannot join ARMY due to less Height.");
			}
		}	
		else
		{
			System.out.println("Sorry, you cannot join ARMY due to less AGE. Please try after "+(18-age)+" Years");
		}
	}
}