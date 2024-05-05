class MyInfo
{
	private String name, nativePlace , Branch;
	private int age;

	MyInfo(String name, String nativePlace, String Branch, int age)
	{
		this.name = name;
		this.nativePlace = nativePlace;
		this.Branch = Branch;
		this.age = age;
	}

	public String getName()

	{
		return name;
	}

	public void setName(String updatedName)
	{
		name = updatedName;
	}

	public String getnativePlace()
	{
		return nativePlace;
	}

	public void setnativePlace(String updatednativePlace)
	{
		nativePlace = updatednativePlace;
	}

	public String getBranch()
	{
		return Branch;
	}

	public void setBranch (String updatedBranch)
	{
		Branch = updatedBranch;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int updatedAge)
	{
		age = updatedAge;
	}



	void displayStudent()
	{
		System.out.println("STUDENT DETAILS");
		System.out.println();
		System.out.println("Name - "+name);
		System.out.println("Native Place : "+nativePlace);
		System.out.println("Branch : "+ Branch);
		System.out.println("Age : "+age);
	}
}


class EncapExample2
{
	public static void main(String[] args) 
	{

		MyInfo obj = new MyInfo("Ramesh Kumar","PUNE","MECH",22);

		//System.out.println(obj.getName());

		obj.setName("Abhay Jadhav");
		//System.out.println(obj.getName());

		obj.displayStudent();

		System.out.println(obj.getnativePlace());

	}
}