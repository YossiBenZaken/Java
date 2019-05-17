package yossi;

public class Person {
	private String fname,lname,id;
	public Person(String ID,String Fname,String Lname) {
		fname = Fname;
		lname = Lname;
		id=ID;
	}
	public String Print() {
		return "ID: " +id+" FirstName: "+fname+" LastName: "+lname;
	}
	public String GetID() {
		return id;
	}
	public String GetFname() {
		return fname;
	}
	public String GetLname() {
		return lname;
	}
}
