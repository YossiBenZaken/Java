package yossi;

public class AdultStudent extends Student{
	private int ingrade1,ingrade2,outgrade1,outgrade2;
	public AdultStudent(String ID,String Fname,String Lname,int inGrade1,int inGrade2,int outGrade1,int outGrade2) {
		super(ID,Fname,Lname);
		ingrade1 = inGrade1;
		ingrade2 = inGrade2;
		outgrade1 = outGrade1;
		outgrade2 = outGrade2;
	}
	@Override
	public int CalcAverage() {
		return (ingrade1+ingrade2+outgrade1+outgrade2)/4;
	}
	@Override
	public boolean HasPermission() {
		if(CalcAverage() > 80) return true;
		return false;
	}
}
