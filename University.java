class University
{
	String name;
	String universityCode;
	int noOfColleges;
	String Type;
	int eshtablishYear;
	int course;

	College college1;

	University(String name, String universityCode, int noOfColleges, String Type, int eshtablishYear, int course)
	{
		this.name = name;
		this.universityCode = universityCode;
		this.noOfColleges = noOfColleges;
		this.Type = Type;
		this.eshtablishYear = eshtablishYear;
		this.course = course;
	}

	public void displayUniversity()
	{
		System.out.println("-------- UNIVERSITY DETAILS --------");
		System.out.println("UNIVERSITY CODE : "+universityCode);
		System.out.println("NO OF COLLEGES : "+noOfColleges);
		System.out.println("TYPE : "+Type);
		System.out.println("ESHTABLISH YEAR : "+ eshtablishYear);
		System.out.println("COURSE : "+course);
	}

	public void createInstanceOfCollege(String Name, String CollegeCode, String Address, int NoOfDeptartment, int StaffCount, char Grade)
	{
		college1 = new College(Name, CollegeCode, Address, NoOfDeptartment, StaffCount, Grade);
	}
}

class College
{
	String Name;
	String CollegeCode;
	String Address;
	int NoOfDeptartment;
	int StaffCount;
	char Grade;
	Department department;


	College(String Name, String CollegeCode, String Address, int NoOfDeptartment, int StaffCount, char Grade)
	{
		this.Name = Name;
		this.CollegeCode = CollegeCode;
		this.Address = Address;
		this.NoOfDeptartment = NoOfDeptartment;
		this.StaffCount = StaffCount;
		this.Grade = Grade;
	}

	public void displayCollege()
	{
		System.out.println();
		System.out.println("----- COLLEGE DETAILS -----");
		System.out.println("NAME : "+Name);
		System.out.println("COLLEGE CODE : "+CollegeCode);
		System.out.println("ADDRESS : "+Address);
		System.out.println("NO OF DEPARTMENT : "+NoOfDeptartment);
		System.out.println("STAFF COUNT : "+StaffCount);
		System.out.println("GRADE : "+Grade);
	}

	public void createInstanceOfDepartment(String Name, String HOD, int ClassRoom, int Staff, int Subject)
	{
		department = new Department(Name, HOD, ClassRoom, Staff, Subject);
	}

}

class Department
{

	String Name;
	String HOD;
	int ClassRoom;
	int Staff;
	int Subject;
	Teacher teacher;


	Department(String Name, String HOD, int ClassRoom, int Staff, int Subject)
	{
		this. Name = Name;
		this.HOD = HOD;
		this.ClassRoom = ClassRoom;
		this.Staff = Staff;
		this.Subject = Subject;
	}

	public void displayDepartment()
	{
		System.out.println();
		System.out.println("----- DEPARTMENT DETAILS -----");
		System.out.println("NAME : "+ Name);
		System.out.println("HOD : "+HOD);
		System.out.println("NO OF CLASS ROOMS : "+ ClassRoom);
		System.out.println("SUBJECT : "+Subject);
	}

	public void createInstanceOfTeacher(String Name, String Subject, long PhoneNumber, String Qualification, int  Experience)
	{
		teacher = new Teacher (Name, Subject, PhoneNumber, Qualification , Experience);
	}

}

class Teacher
{
	String Name;
	String Subject;
	long PhoneNumber;
	String Qualification;
	int Experience; 

	Teacher(String Name, String Subject, long PhoneNumber, String Qualification, int Experience)
	{
		this.Name = Name;
		this.Subject = Subject;
		this.PhoneNumber = PhoneNumber;
		this.Qualification = Qualification;
		this.Experience = Experience;
	}

	public void displayTeacher()
	{
		System.out.println();
		System.out.println("TEACHER DETAILS");
		System.out.println("NAME  : "+ Name);
		System.out.println("SUBJECT : "+Subject);
		System.out.println("PHONE NUMBER : "+ PhoneNumber);
		System.out.println("QUALIFICATION : "+Qualification);
		System.out.println("EXPERIENCE : "+ Qualification);
	}
}

class AggregationDriver
{
	public static void main(String[] args) 
	{
		University obj = new University ("SPPU","SPPU123", 1100,"Government", 1950,300);
		obj.displayUniversity(); 

		obj.createInstanceOfCollege("SCOE","SC203D","Sinhgad Road",7,77,'B');
		obj.college1.displayCollege();

		obj.college1.createInstanceOfDepartment("Computer Science","Vrushali Kulkarni",15,11,42);
		obj.college1.department.displayDepartment();

		obj.college1.department.createInstanceOfTeacher("Shrikant Sir","JAVA",9322075565l,"M-TECH",6);
		obj.college1.department.teacher.displayTeacher();
	}
}