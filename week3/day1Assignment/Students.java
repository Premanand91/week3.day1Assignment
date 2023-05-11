package week3.day1Assignment;

public class Students 
{
    public void getStudentInfo()
    {
    	System.out.println("Empty Argument Method of a Class Students");
    }
    public int getStudentInfo(short id)
    {
    	return id;
    }
    public String getStudentInfo(int id,String name)
    {
		return (id+" , "+name);
    	
    }
    public String getStudentInfo(String email,String phoneNumber)
    {
    	return (email+" , "+phoneNumber);
    }
	public static void main(String[] args) 
	{
		Students objStudents=new Students();
		System.out.println(objStudents.getStudentInfo("PremanandMurugesan836@gmail.com", "9876543210"));
		System.out.println(objStudents.getStudentInfo(15,"Premanand"));
		System.out.println(objStudents.getStudentInfo((short) 10));
		

	}

}
