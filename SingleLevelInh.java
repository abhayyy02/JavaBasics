import java.util.*;
class ProgramingLanguage
{
	String Type;
	String Level;
	int InventedYear;
	String FounderName;
	double LatestVersion;
	String Extension;

	ProgramingLanguage(String Type, String Level, int InventedYear, String FounderName, double LatestVersion, String Extension)
	{
		super();
		this.Type = Type;
		this.Level = Level;
		this.InventedYear = InventedYear;
		this.FounderName = FounderName;
		this.LatestVersion = LatestVersion;
		this.Extension = Extension;
	}

	public void displayPragramingLanguage()
	{
		System.out.println();
		System.out.println();
		System.out.println("Programing Language Details");
		System.out.println();
		System.out.println("TYPE : "+ this.Type);
		System.out.println("Level : "+ this.Level);
		System.out.println("InventedYear : "+ this.InventedYear +" Year" );
		System.out.println("FounderName : "+ this.FounderName);
		System.out.println("LatestVersion : "+ this.LatestVersion);
		System.out.println("Extension : "+ this.Extension);
	}

}


class Java extends ProgramingLanguage
{
	String [] features;
	boolean platformIndependent;

	Java(String [] features, boolean platformIndependent,String Type, String Level, int InventedYear, String FounderName, double LatestVersion,String Extension)
	{
		super(Type,Level,InventedYear,FounderName,LatestVersion,Extension);
		this.features = features;
		this.platformIndependent = platformIndependent;
	}

	public void displayJava()
	{
		System.out.println();
		System.out.println("JAVA DETAILS");
		System.out.println();
		System.out.println("It is a Platform Independent : "+ this.platformIndependent);
		System.out.println("Features of Java :  "+ Arrays.toString(this.features));
	}
}

class SingleLevelInhDriver
{
	public static void main(String[] args) 
	{
	
		String [] features = {"1.MultiThreaded", "2.Secure and Robus", "3. Portable","4.Dynamic (Strong Memory Management)"};

		Java obj = new Java (features,true,"Object Oriented", "High Level", 1991, "James Gosling",1.22,".java");
		obj.displayPragramingLanguage();
		obj.displayJava();
	
	}
}