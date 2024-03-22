import java.util.Scanner;
class While_PowerandLength
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");

		int num = sc.nextInt();
		int dup = num;
		int length = 0;
		int power = 1;

		while(num != 0)
		{
			length++;
			num/=10;
		}

		for(int i=0;i<=length;i++)
		{
			power *= dup;
		}

		System.out.println("The power is " +power);
		System.out.println("The length of num is " +length);
	}
}
