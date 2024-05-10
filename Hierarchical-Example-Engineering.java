class Engineering
{
	String university;
	String college;
	int branches;

	Engineering(String university, String college, int branches)
	{
		super();
		this.university = university;
		this.college = college;
		this.branches = branches;
	}

	public void displayEng()
	{
		System.out.println("--- Engineering ---");
		System.out.println("University : "+this.university);
		System.out.println("College : "+this.college);
		System.out.println("Branches : "+this.branches);

	}

}

class Computer extends Engineering
{
	int numOfStudentsC;
	String subCodeC;
	String hodC;
	int StaffC;

	Computer(int numOfStudentsC, String subCodeC, String hodC, int StaffC ,String university, String college, int branches)
	{
		super(university,college,branches);
		this.numOfStudentsC = numOfStudentsC;
		this.subCodeC = subCodeC;
		this.hodC = hodC;
		this.StaffC = StaffC;
	}

	public void disaplyComputer()
	{
		System.out.println();
		System.out.println("Branch - Computer Science ");
		System.out.println("Number of students : "+numOfStudentsC);
		System.out.println("Subject Code : "+subCodeC);
		System.out.println("HOD : "+hodC);
		System.out.println("Staff Avabality : "+StaffC);
	}

}

class Civil extends Engineering
{
	int numOfStudentsV;
	String subCodeV;
	String hodV;
	int StaffV;

	Civil(int numOfStudentsV,  String subCodeV, String hodV, int StaffV, String university, String college, int branches)
	{
		super(university,college,branches);
		this.numOfStudentsV = numOfStudentsV;
		this.subCodeV = subCodeV;
		this.hodV = hodV;
		this.StaffV = StaffV; 
	}

	public void displayCivil()
	{
		System.out.println();
		System.out.println("Branch - CIVIL");
		System.out.println("Number of Students : "+numOfStudentsV);
		System.out.println("Sub Code: "+subCodeV);
		System.out.println("HOD : "+hodV);
		System.out.println("Staff Avabality : "+StaffV);
	}
}

class Mechanical extends Engineering
{
	int numOfStudentsM;
	String subCodeM;
	String hodM;
	int StaffM;

	Mechanical(int numOfStudentsM, String subCodeM, String hodM , int StaffM, String university, String college, int branches)
	{
		super(university,college,branches);
		this.numOfStudentsM = numOfStudentsM;
		this.subCodeM = subCodeM;
		this.hodM = hodM;
		this.StaffM = StaffM;
	}

	public void disaplyMechanical()
	{
		System.out.println();
		System.out.println("Branch - Mechanical");
		System.out.println("Number of Students : "+numOfStudentsM);
		System.out.println("Subject Code : "+subCodeM);
		System.out.println("HOD : "+hodM);
		System.out.println("Staff Avabality : "+StaffM);
	}

}

class Entc extends Engineering
{
	int numOfStudentsE;
	String subCodeE;
	String hodE;
	int StaffE;

	Entc(int numOfStudentsE, String subCodeE, String hodE, int StaffE, String university, String college, int branches)
	{
		super(university,college,branches);
		this.numOfStudentsE = numOfStudentsE;
		this.subCodeE = subCodeE;
		this.hodE = hodE;
		this.StaffE = StaffE;
	} 

	public void displayEnct()
	{
		System.out.println();
		System.out.println("Branch - ENTC");
		System.out.println("Number of students :"+numOfStudentsE);
		System.out.println("SUBJECT CODE : "+subCodeE);
		System.out.println("HOD : "+hodE);
		System.out.println("Staff Avabality : "+StaffE);
	}
}

class EngineeringDriver
{
	public static void main(String[] args) 
	{
		Entc obj = new Entc (40,"En-510","J.Patil", 6,"MIT MANIPAL","UDUPI",4);
		System.out.println();
		obj.displayEng();

		obj.displayEnct();

		Mechanical obj1 = new Mechanical(30,"Mech-2","P.Pawar",5,"SPPU PUNE","SCOE",6);
		obj1.disaplyMechanical();

		Computer obj2 = new Computer(100,"CS-602","A.Jadhav",12,"MIT","WPU",5);
		obj2.disaplyComputer();

		Civil obj3 = new Civil(50,"C-02","S.Shinde",4,"SGU","SGE",5);
		obj3.displayCivil();

	}
}