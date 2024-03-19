class ForPatterns
{
	public static void main(String[] args) 
	{

//1.
		System.out.println("---------------1.SQUARE FROM (****)----------------");
		for (int i = 1;i<=4 ;i++ ) 
		{
			
			for (int j=1;j<=4;j++)
			{
				System.out.print("* ");
			}

			System.out.println();
		}


//2.
		
		System.out.println("--------2.TRIANGLE FROM (******)-------");
		for (int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}

			System.out.println();
		}


//3.
		System.out.println("--------3.TRIANGLE FROM (a,ab,abc,abcd)-------");
		for (int i=1;i<=5;i++)
		{
			char ch = 'a';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch++ +" ");
			}

			System.out.println();	
		}


//4.
		System.out.println("--------4.TRIANGLE FROM (1,12,123,1234,12345)-------");
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}

//5.
		System.out.println("--------5.TRIANGLE FROM (1,23,456,78910)-------");
		int num = 1;
		for(int i=1;i<=4;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(num++ +" ");
			}

			System.out.println();
		}	

//6.
		System.out.println("--------5.TRIANGLE FROM (a,bc,def,ghij,klmno)-------");
		char ch='a';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch++ +" ");

			}
			System.out.println();
		}

	}

}