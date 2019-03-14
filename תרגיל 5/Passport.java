package dateproject;

public class Passport {
	private String name;
	private int num;
	private Date ex;
	public Passport(String name,int number,Date expiryDate) {
		this.name=name;
		num=number;
		ex=expiryDate;
	}
	public Passport(Passport other)
	{
		name=other.name;
		num=other.num;
		ex=other.ex;
	}
	public String getName() {
		return name;
	}
	public String showPassport() {
		return "Name: "+getName()+"\nPass. num: "+num+"\nExp date: "+ex.showDate();
	}
}
