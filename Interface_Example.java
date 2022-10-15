//Interfaces: It is used for creating abstract method.

//Example of Interface and abstract method.
interface Abs_function{
	void calcInterest(float balance);
}

class SBI implements Abs_function{
	float a,interest,totBalance;
	int accountNo;
	
	public void calcInterest(float balance){
		a=balance;
		interest=a*5/100;
		totBalance=a+interest;
		System.out.println("Your interest is:"+interest);
		System.out.println("Your total balance is:"+totBalance);
	}
	public void showInfo(int a){
		accountNo=a;
		System.out.println("Your account number is:"+accountNo);
	}
}
public class Interface_Example{
	public static void main(String args[]){
		SBI Arpan = new SBI();
		Arpan.calcInterest(5000);
		Arpan.showInfo(1010);
	}
}
