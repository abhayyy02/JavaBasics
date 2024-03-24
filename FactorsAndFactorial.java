import java.util.Scanner;
class FactorsAndFactorial
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NUMBER : ");
		int num = sc.nextInt();

		System.out.println("");
		//1.FACTORS FOR THE GIVEN NUMBER :

		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}

		}

		System.out.println("These are the factors of given number." );
		System.out.println("");
		

		//2. FACTORIAL OF A NUMBER : 
		int fact = 1;

		for(int i=num;i>=1;i--)
		{
			fact = fact*i;
		}

		System.out.println("Factorial is : " + fact);

	}
}