package yossi;

public class YoungStudent extends Student{
	public int ingrade1,ingrade2,ingrade3,numhours,grade;
	public YoungStudent(String ID,String Fname,String Lname,int inGrade1,int inGrade2,int inGrade3,int NumHours,int Grade)
	{
		super(ID,Fname,Lname);
		Grade = grade;
		ingrade1 = inGrade1;
		ingrade2 = inGrade2;
		ingrade3 = inGrade3;
		numhours = NumHours;
		grade= Grade;
	}
	public int CalcAverage()
	{
		return (ingrade1+ingrade2+ingrade3)/3;
	}
	public boolean HasPermission() {
		if(CalcAverage()>70 && grade >80) return true;
		return false;
	}
}
