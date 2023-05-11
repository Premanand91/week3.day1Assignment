package week3.day1Assignment;

public class Automation extends MultipleLanguage implements Language,TestTool
{

	public static void main(String[] args) 
	{
		Automation objAutomation=new Automation();
		objAutomation.Selenium();
		objAutomation.java();
		objAutomation.ruby();

	}

	public void Selenium()
	{
		System.out.println("Selenium Method of a Interface TestTool");
		
	}

	public void java()
	{
		System.out.println("Java Method of a Interface Language");
		
	}

	@Override
	public void ruby() 
	{
		System.out.println("ruby Overrided Method of a Abstract Class Multiple Language");
		
	}

}
