/*Exception Handling
What is Exception?
Exception is an abnormal condition in a program. The class Exception represents 
exceptions that a program faces due to abnormal or special conditions during
execution.
*/

//Example of execution handling
import java.util.Scanner;
public class Exception_Handling{
	public static void main(String args[])
	{
		try{
			int a,b,c;
			Scanner MyObj = new Scanner(System.in);
			System.out.println("Enter Ist number- ");
			a=MyObj.nextInt();
			
			System.out.println("Enter IInd number- ");
			b=MyObj.nextInt();
			
			c=a/b;
			System.out.println(+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero is not allowed");
		}
	}
}
			
			