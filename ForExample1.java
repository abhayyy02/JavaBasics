class ForExample1
{
	public static void main(String[] args) 
	{
		System.out.println("---------- NUMBERS BETWEEN 0 to 100 -------------");	

		for ( int i=0; i<=100; i++)
			
			{
				System.out.println( i +" ");
			}

		System.out.println("---------- EVEN NUMBER BETWEEN 0 to 100 -------------");
		for (int i=0;i <=100 ; i++)

			{
				if(i%2==0)
				{
					System.out.println(i);
				}
				
			}

		System.out.println("---------- ODD NUMBER BETWEEN 0 to 100 -------------");
		for (int i=0;i <=100 ; i++)
			{
				if(i%2!=0)
				System.out.println(i);
			}

		System.out.println("---------- UPPER CASE A to Z CHARACTER (ASCENDING) -------------");
		for (char ch=65 ; ch<=90 ; ch++)
		{
			System.out.println(ch);
		}

		System.out.println("---------- LOWER CASE a to z CHARACTER (ASCENDING) -------------");
		for (char ch=97; ch<=122; ch++)
			{
				System.out.println(ch);
   			}

   		System.out.println("---------- UPPER CASE A to Z CHARACTER (DECENDING) -------------");
   		for (char ch=90; ch>=65; ch--)
   		{
   			System.out.println(ch);
   		}

		System.out.println("---------- LOWER CASE A to Z CHARACTER (DECENDING) -------------");
		for (char ch = 122; ch>=97;ch--)
		{
			System.out.println(ch);
		}
    }

}

