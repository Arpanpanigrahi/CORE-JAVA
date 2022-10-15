import java.util.Scanner;
public class Do_While_Loop{
	public static void main(String args[]){
		int i=0;
		int b=2;
		do{
			Scanner MyObj = new Scanner(System.in);
			System.out.print("Enter any number- ");
			b=MyObj.nextInt();
			i=b*b;
			System.out.println(i); 
		}while(i!=0);
	}
}