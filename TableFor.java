import java.util.Scanner;
class TableFor
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want table of : ");	
		int num = sc.nextInt();
		System.out.println("THE TABLE IS DISPLAYED AS FOLLOWS");
		for(int i=1;i<=10;i++)
		{
			System.out.println(num +" * "+ i + " = "+ (num*i));

		}

	}

}