import java.util.Scanner;
public class Example_8 {
	public static void main(String args[]) {
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for division");
		System.out.println("Enter your choice : ");
		//input
		Scanner sc = new Scanner(System.in);
		//call
		int choice = sc.nextInt();
		
		double a,b,c;
		
		System.out.println("Enter first number");
		a=sc.nextDouble();
		
		System.out.println("Enter second number");
		b=sc.nextDouble();
		
		switch(choice){
			case 1: c=a+b;
			System.out.println("Result is : "+c);
			break;
			
			case 2: c=a-b;
			System.out.println("Result is : "+c);
			break;
			
			case 3: c=a*b;
			System.out.println("Result is : "+c);
			break;
			
			case 4: c=a/b;
			System.out.println("Result is : "+c);
			break;
			
			default:System.out.println("Wrong input!");
			
		}
	}
}