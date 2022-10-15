//Java Loops - While, do while & for loop
/*Looping in Java
1. While Loop
2. Do While Loop
3. For Loop

While Loop (Syntax)
while(condition){
	//Statements
}

Example:
public class While Loop{
	psvm(String[] args){
		int i=1;
		while(i<=10){
			S.O.Pln(i);
			i++;
		}
	}
}

//Program to print the Fibonacci_Series
public class Fibonacci_Series{
	public static void main(String[] args){
		int num = 5;
		int a,b,c,i = 3;
		a = 0;
		b = 1;
		if(num == 1)
			System.out.println(a);
		if(num >= 2)
			System.out.println(a);
			System.out.println(b);
		
		while(i<=num)
		{
			c = a+b;
			System.out.println(c);
			a = b;
			b = c;
			i++;
		}
	}
}
*/


/*Do While Loop (Syntax)
do{
	//Statements
}
while(condition);

Example:
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
*/
			
/*For Loop (Syntax)
for(initialization;condition;update){
		//Statements
}

Example:
//Program for printing table of any given number.
public class For_Loop{
	public static void main(String args[]){
		int num=3;
		int b;
		int i;
		for(i=1;i<=10;i++){
			b=num*i;
			System.out.println(b);
		}
	}
}
*/

/*Example:
//Find factorial of a number
public class Factorial{
	public static void main(String args[]){
		int fact,i,n;
		fact = 1;
		n=3;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.print("Factorial of"+n);
		System.out.print("is:"+fact);
	}
}
*/
 
/*Nested for (used in array)
Example: 
public class Nested_For{
	public static void main(String args[]){
		int i,j;
		for(i=0;i<=5;i++){
			for(j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
*/