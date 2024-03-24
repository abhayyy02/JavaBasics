import java.util.Scanner;
class SwitchMonth
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int monthNum = sc.nextInt();
		String month = null;

		switch(monthNum)
		{
		case 1 : month = "JAN";break;
		case 2 : month = "FEB";break;
		case 3 : month = "MAR";break;
		case 4 : month = "APR";break;
		case 5 : month = "MAY";break;
		case 6 : month = "JUNE";break;
		case 7 : month = "JULY";break;
		case 8 : month = "AUG";break;
		case 9 : month = "SEPT";break;
		case 10 : month = "OCT";break;
		case 11 : month = "NOV";break;
		case 12 : month = "DEC";break;

		default : System.out.println("INVALID INPUT ");

		}	

		System.out.println((month != null) ? (monthNum+" - "+month) :" ");
	}

}