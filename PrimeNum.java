import java.util.Scanner;
class PrimeNum
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number .");
		int num = sc.nextInt();
		checkPrime(num);
	}
	public static void checkPrime(int num)
	{
		boolean condition = true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				condition = false;
				break;
			}
			
		}
		if(condition)
		{
			System.out.println(num+" Prime");
		}
		else
		{
			System.out.println(num+" not prime");
		}
	}

}
