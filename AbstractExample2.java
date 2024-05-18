abstract class Parent
{
	abstract void m1();
	abstract void m2();
	static void m3()
	{
		System.out.println("--PARENT--");
	}
}

abstract class Child1 extends Parent
{
	void m2()
	{
		System.out.println("M2() implementation from Child-1");
	}

	abstract void m4();	
}

class SubChild extends Child1
{
	void m1()
	{
		System.out.println("M1() implementation from Sub-child");
	}  

	void m4()
	{
		System.out.println("M4 implementation from Sub-Child");
	}
}

class Child2 extends Parent
{
	void m1()
	{
		System.out.println("m1() implementation from Child-2 ");
	}

	void m2()
	{
		System.out.println("M2 implementation from Child-2 ");
	}

	static void m5()
	{
		System.out.println("M5() implementation from  Child-2 ");
	}
}

class AbstractExample2Driver
{
	public static void main(String[] args) 
	{
		Child2 obj = new Child2();
		obj.m1();


		SubChild obj1 = new SubChild();
		obj1.m4();	

		Parent.m3();
	}
}