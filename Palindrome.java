import java.util.Scanner;
class Enjoyy
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int num = sc.nextInt();

		int dup = num;
		int last_digit = 0;
		int rev = 0;

		while (num>0)
		{
			last_digit = num%10;
			rev = rev*10 + last_digit;
			num=num/10;
		}

		System.out.println(rev);


		if (dup==rev)
		{
			System.out.println(" PALANDROME ");
		}

		else
		{
			System.out.println("SORRY");
		}
	}
}