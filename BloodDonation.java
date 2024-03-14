import java.util.Scanner;
class BloodDonation
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your AGE :");
		byte age = sc.nextByte();

		if(age>=20)
		{
			System.out.println("Have you consumed Alcohol/Cigarette in past 24.HRS (yes/no)");
			String Answer = sc.next().toLowerCase();

			if(Answer.equals("yes"))
			{
				System.out.println("You cannot donate blood, due to consumption of Alcohol or Cigarette ");
			}

			else 
			{
				System.out.println("Enter you weight ");
				float weight = sc.nextFloat();

				if(weight>=50)
				{
					System.out.println("You can donate blood");
				}
				else
				{
					System.out.println("You cannot donate the blood due to less weight");
				}
			}				
		}	


		else
		{
			System.out.println("Sorry your age criteria is failed, so you can't donate the blood. please try after"+(18-age)+ " years ");
		}
	}
}