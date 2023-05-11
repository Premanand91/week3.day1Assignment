package week3.day1Assignment;

public class Student extends Department
{
     public void studentName()
     {
    	 System.out.println("Student Name Method of a Class Student");
     }
     public void studentDept()
     {
    	 System.out.println("Stuednt Dept Method of a Class Student");
     }
     public void studentId()
     {
    	 System.out.println("Student ID Method of a Class Student");
     }
	public static void main(String[] args)
	{
		Student objStudent=new Student();
		objStudent.collegeName();
		objStudent.collegeCode();
		objStudent.collegeRank();
		objStudent.deptName();
		objStudent.studentName();
		objStudent.studentDept();
		objStudent.studentId();

	}

}
