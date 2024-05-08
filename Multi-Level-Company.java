class Company
{
	String nameC;
	String ownerC;
	String companyID;
	double market_Size;
	String location;

	static 
	{
		System.out.println("Multi-Level Inheritance");
	}

	Company(String nameC, String ownerC, String companyID, double market_Size, String location)
	{
		super();
		this.nameC = nameC;
		this.ownerC = ownerC;
		this.companyID = companyID;
		this.market_Size = market_Size;
		this.location = location;
	}	

	public void displayCompany()
	{
		
		System.out.println();
		System.out.println("----- "+nameC+ " -----");
		System.out.println();
		System.out.println("Owner : "+ownerC);
		System.out.println("Company ID : "+companyID);
		System.out.println("Market Size : "+market_Size+ "Cr");
		System.out.println("Location : "+location);
	}
	
}

class Domain extends Company
{
	String nameD;
	String captain;
	int numEmp;

	Domain(String nameD, String captain, int numEmp,String nameC, String ownerC, String companyID, double market_Size, String location)
	{
		super(nameC,ownerC,companyID,market_Size,location);
		this.nameD = nameD;
		this.captain = captain;
		this.numEmp = numEmp;
	}

	public void displayDomain()
	{
		System.out.println();
		System.out.println("--- Domain Details ---");
		System.out.println("Domain Name : "+nameD);
		System.out.println("Lead of Domain : "+ captain);
		System.out.println("Total num of Employes are : "+numEmp);
	}
}

class Dept extends Domain
{
	String nameDe;
	double sal;
	int empD;

	Dept(String nameDe, double sal,int empD ,String nameD, String captain, int numEmp,String nameC, String ownerC, String companyID, double market_Size, String location)
	{
		super(nameD,captain,numEmp,nameC,ownerC,companyID,market_Size,location);
		this.nameDe = nameDe;
		this.sal = sal;
		this.empD = empD;
	}

	public void displayDept()
	{
		System.out.println();
		System.out.println("--- Department Details ---");
		System.out.println("Department Name : "+nameDe);
		System.out.println("Total money required for Department as Salary of Employes : "+sal+"Cr");
		System.out.println("Total Number of Employees : "+empD);

	}
}

class Interns
{
	String nameCollege;
	int stipend;
	String YMOJ;

	Interns(String nameCollege, int stipend, String YMOJ)
	{
		this.nameCollege = nameCollege;
		this.stipend = stipend;
		this.YMOJ = YMOJ;
	}

	public void dislpayInterns()
	{
		System.out.println();
		System.out.println("Detail of Interns");
		System.out.println("Name of Institution : "+nameCollege);
		System.out.println("Stipend : "+stipend);
		System.out.println("Joining Month : "+YMOJ);
	}
}


class  CompanyDriver
{
	public static void main(String[] args) 
	{
		System.out.println();
		Dept obj = new Dept("Development ",2.27, 13, "Banking","M.D Jadhav",40,"Shub Group of Industries","Abhay Jadhav","2TF-2002",32,"Pune");

		obj.displayCompany();
		obj.displayDomain();
		obj.displayDept();

		Interns objI = new Interns("MIT-WPU",7000,"August-2024");
		objI.dislpayInterns();
	}
}