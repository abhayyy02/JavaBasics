class StaticE
{
	static 
	{
		System.out.println("HELLO FROM SB 2");
		StaticBlock.m1();
	}

	static 
	{
		System.out.println("Hello from SB 1");
	}

	public static void main(String[] args) 
	{
		System.out.println("HI From Main");	
		StaticBlock.m1();	
	}
}

class StaticBlock
{
	static 
	{
		System.out.println("Hello from SB 3");
	}

	public static void m1()
	{
		System.out.println("Hi from M1()");
	}
}