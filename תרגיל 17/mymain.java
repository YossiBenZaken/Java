package yossi;

public class mymain {

	public static void main(String[] args) {
		Student s1 = new YoungStudent("315368134","Yossi","Ben Zaken",100,80,90,150,90);
		Student s2 = new AdultStudent("123456789","Dima","Lozovsky",100,90,70,80);
		Student s3 = new YoungStudent("315368135","Avichay","Ben Zaken",70,80,70,150,90);
		Student s4 = new AdultStudent("123456788","Aviad","Ben Zaken",100,60,40,80);
		AllStudents classStudent = new AllStudents(20);
		classStudent.addStudent(s1);
		classStudent.addStudent(s2);
		classStudent.addStudent(s3);
		classStudent.addStudent(s4);
		classStudent.ToString();
		System.out.println(classStudent.AllHasPermission());
		classStudent.printYoungS();
	}

}
