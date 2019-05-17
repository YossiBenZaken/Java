package yossi;

public abstract class Student extends Person{
	public abstract int CalcAverage();
	public abstract boolean HasPermission();
	public Student(String ID,String Fname,String Lname)
	{
		super(ID, Fname, Lname);
	}
	@Override
	public String Print() {
		return super.Print();
	}
	public String GetID()
	{
		return super.GetID();
	}
	public String GetFirstName()
	{
		return super.GetFname();
	}
	public String GetLastName()
	{
		return super.GetLname();
	}
}
