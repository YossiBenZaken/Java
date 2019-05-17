package yossi;

public class AllStudents {
	private Student[] s;
	private int counter;
	public AllStudents(int num) {
		s= new Student[num];
		counter=0;
	}
	public void addStudent(Student newStudent)
	{
		if(counter<20)
			s[counter++] = newStudent;
		else
			System.out.println("The class is full");
	}
	public void removeStudent(Student newStudent)
	{
		for(int i=0;i<counter;i++)
			if(s[i].GetID() == newStudent.GetID())
			{
				for(;i<counter-1;i++)
					s[i] = s[i+1];
				counter--;
			}
	}
	public void ToString() {
		for(int i=0;i<counter;i++)
			System.out.println(s[i].Print());
	}
	public void printYoungS() {
		for(int i=0;i<counter;i++)
			if(s[i] instanceof YoungStudent)
				System.out.println(s[i].Print());
	}
	public double CalcAdultsAverage() {
		int sum=0,count=0;
		for(int i=0;i<counter;i++)
			if(s[i] instanceof AdultStudent)
			{
				sum+=s[i].CalcAverage();
				count++;
			}
		return sum/(count*1.0);
	}
	public int AllHasPermission() {
		int count=0;
		for(int i=0;i<counter;i++)
			if(s[i].HasPermission() ==true) count++;
		return count;
	}
}
