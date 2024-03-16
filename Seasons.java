import java.util.Scanner;
class Seasons
{
	public static void main(String[] args) 

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the MONTH :");
		String month = sc.next().toUpperCase();
		switch(month)

		{
			case "OCT":
			case "NOC":
			case "DEC":
			case "JAN": System.out.println(month + "It's WINTER ");break;

			case "FEB":
			case "MAR":
			case "APR":
			case "MAY": System.out.println(month + "It's SUMMER ");break;

			case "JUNE":
			case "JULY":
			case "AUG":
			case "SEPT": System.out.println(month+"It's MANSOON ");break;

			default :System.out.println("INVALID INPUT");
		}	
	}
}