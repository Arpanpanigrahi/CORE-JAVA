//nested if

public class Example_6 {
	public static void main(String args[]) {
		int amount = 100;
		//int amount = 1000;
		//int amount = 21000;
		if(amount >= 500){
			if(amount <= 20000)
				System.out.println("Withdrawal successful");
			else 
				System.out.println("Try again!");
		}
		System.out.println("Withdrawal amount should be greater than 500!");
	}
}