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