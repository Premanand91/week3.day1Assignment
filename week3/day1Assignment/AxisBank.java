package week3.day1Assignment;

public class AxisBank extends BankInfo
{
    @Override
	public void deposit()
    {
    	System.out.println("Deposit Method of a Class AxisBank");
    }
	public static void main(String[] args) 
	{
		AxisBank objAxisBank=new AxisBank();
		objAxisBank.deposit();

	}

}
