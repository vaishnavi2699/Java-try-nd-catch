package TryAndCatchPrograms;

public class Demo17 
{

	public static void main(String[] args) 
	{
		System.out.println("hai vaishnavi");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("this is catch block");
		}
		System.out.println("welcome to hyberabad");

	}

}
