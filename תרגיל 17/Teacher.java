package yossi;

public class Teacher extends Person{
	private String kita;
	public Teacher(String ID,String Fname,String Lname,String Kita)
	{
		super(ID,Fname,Lname);
		kita = Kita;
	}
	@Override
	public String Print() {
		return super.Print() + " Class:" + kita;
	}
}
