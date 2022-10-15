//Find factorial of a number
public class Factorial{
	public static void main(String args[]){
		int fact,i,n;
		fact = 1;
		n=3;
		for(i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.print("Factorial of "+n);
		System.out.print(" is : "+fact);
	}
}