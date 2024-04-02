import java.util.Scanner;
class Example
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER ");

		int num = sc.nextInt();
		checkPrime(num);

		
	}

	public static void checkPrime(int num)
	{
		boolean	condition = true;
		for (int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				condition = false;
				break;

			}
		}

		if (condition)
		{
			System.out.println("PRIME");
		}
		else{
			System.out.println("NOT PRIME");
		}
	}

	//2. METHOD CALLING> -->
	/*
	public static void main(String[] args) 
	{
		System.out.println("Main Starts.");
		mahesh();
		suresh();
		ganesh();
		System.out.println("Main Ends.");
		suresh();
	}

	public static void mahesh()
	{
		System.out.println("Mahesh Starts.");
		System.out.println("Mahesh Ends.");

	}
	
	public static void suresh()
	{
		System.out.println("Suresh Starts.");
		System.out.println("Suresh Ends.");
	}

	public static void ganesh()
	{
		System.out.println("Ganesh Starts.");
		System.out.println("Ganesh Ends.");
	}
	}*/
}

