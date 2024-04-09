import java.util.Scanner;
class LeapYear
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE YEAR ");
		int year = sc.nextInt();

		if((year%4==0) || (year%400==0) && (year%100!=0))
		{
			System.out.println(year + " is a LEAP Year");
		}

		else
		{
			System.out.println(year+ " is not a Leap Year");
		}
	}
}