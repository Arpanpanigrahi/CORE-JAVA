/*Array in Java (1D & 2D)
Arrays are used to store multiple values in a single variable. 
But values should be same type.
Syntax: data_type[] array name = new type[size];
Example: int myArray[] = new int[size];

Note: declaration at compile time.
	  definition at run time.
*/

//Example: Single dimension array
import java.util.*;
public class Array_in_Java{
	public static void main(String args[]){
		//initialization
		//int[] marks = new int[3];
		//int marks[] = new int[3];
		int marks[] = {97,98,95};
		//marks[0] = 97; //phy
		//marks[1] = 98; //chem
		//marks[2] = 95; //eng
		//System.out.println(marks[0]);
		//System.out.println(marks[1]);
		//System.out.println(marks[2]);
		
		for(int i=0;i<3;i++){
			System.out.println(marks[i]);
		}
		
	}
}	

		 