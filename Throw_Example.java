//Throw Example
public class Throw_Example{
	public static void main(String args[])
	{
		int balance=5000;
		int withdrawlAmount=4000;
		if(balance<withdrawlAmount)
			throw new ArithmeticException("Insufficient balance");
		
		balance=balance-withdrawlAmount;
		System.out.println("Transaction Successfully completed");
		System.out.println("Program Continue....");
	}
}