//switch case using customer care
import java.util.Scanner;
public class Example_7 {
	public static void main(String args[]) {
		System.out.println("Press 1 for Hindi");
		System.out.println("Press 2 for English");
		System.out.println("Enter your choice : ");
		//input
		Scanner sc = new Scanner(System.in);
		//call
		int choice = sc.nextInt();
		
		switch(choice){
			case 1: System.out.println("You have selected hindi language");
			break;
			case 2: System.out.println("You have selected english language");
			break;
			default: System.out.println("Wrong input!");
		}
	}
}