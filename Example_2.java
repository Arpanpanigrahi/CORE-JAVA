//How to get input from user?
// Method:1> Using Scanner Class

import java.util.Scanner; //using scanner class we can take input from user
public class Example_2
{
    public static void main(String[] args){
        Scanner MyObj = new Scanner(System.in);
        System.out.println("Enter first number-");
        int a=MyObj.nextInt();


        System.out.println("Enter second number-");
        int b=MyObj.nextInt();

        int c = a+b;

        System.out.println("Total is :"+c);
    }
 }
