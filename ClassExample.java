class ClassExample
{
	public static void main(String[] args) 
	{
		System.out.println("Hello from Class - ClassExample and Main Method");	
		ClassExample2.m1();
		ClassExample3.m2();
	}
}

class ClassExample2
{
	public static void m1()
	{
		System.out.println("Hello from Class - ClassExample2 and Method - m1()");
	}
}

class ClassExample3
{
	public static void m2()
	{
		System.out.println("Hello from Class - ClassExample3 and Method - m2()");
	}
}