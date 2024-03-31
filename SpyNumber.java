import java.util.Scanner;
class SpyNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num = sc.nextInt();

		int dup = num;
		int sum = 0;
		int product = 1;

		while(num!=0)
		{
			int LastDigit = num%10;
			sum = sum + LastDigit;
			product = product * LastDigit;
			num = num/10;
		}
		
		System.out.println((sum==product) ? dup+" is a SPY Number.": dup+ " is not a SPY Number");
	}
}