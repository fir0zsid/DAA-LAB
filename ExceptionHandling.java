import java.util.*;

public class ExceptionHandling 
{

	public static void main(String[] args)
	{
		System.out.println("Demonstrating Divide by Zero Exception Handling\n--------------------------------");
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the dividend:");
		a = input.nextInt();
		System.out.println("Enter the divisor:");
		b = input.nextInt();
		try
		{
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Divide by zero Error!!!");
			System.out.println(e.getMessage());
		}

	}

}
