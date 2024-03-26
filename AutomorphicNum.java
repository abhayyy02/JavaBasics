import java.util.Scanner;
class Automorphic
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int dup = num;
		int sqr =num*num;
		int divisor = 1;

		while(num!=0)
		{
			divisor = divisor * 10;
			num = num/10;
		}

		int lastDigit = sqr%divisor;
		System.out.println(dup==lastDigit ? " AUTOMORPHIC NUMBER" : " NOT A AUTOMORPHIC NUMBER ");

	}
}