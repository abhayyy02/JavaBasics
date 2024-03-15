import java.util.Scanner;
class If_Election
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your AGE ");
		int age = sc.nextInt();

		if(age >=18)
		{
			System.out.println("Do you have a Voter Card (yes/no)");
			String Answer = sc.next().toLowerCase();

			if(Answer.equals("yes"))
			{
				System.out.println("---*{WELCOME}*---");
				System.out.println("1.CONGRESS");
				System.out.println("2.BJP");
				System.out.println("3.NCP");
				System.out.println("4.SHIVSENA");
				System.out.println("5.AAP");
				System.out.println("6.MNS");

				System.out.println("Please select the party you want to vote for :");
				byte party = sc.nextByte();

				if(party==1)
				{
					System.out.println("You voted for Congress");
				}
					else if (party == 2)
				{
					System.out.println("You voted for BJP");
				}
					else if (party == 3)
				{
					System.out.println("You voted for NCP");

				}
					else if(party == 4)
				{
					System.out.println("You voted for SHIVSENA");
				}
					else if (party == 5)
				{
					System.out.println("You voted for AAP");
				}

					else if(party == 6)
				{
					System.out.println("You voted for MNS");
				}
					else 
					{
						System.out.println("Invalid Intput");
					}
				}
					else 
				{
					System.out.println("Please be here with Voter Card");
				}
			}

			else 
		{
			System.out.println("Your are not eligibile fro voting. Please try after "+(18-age)+" years");
		}
	}
}