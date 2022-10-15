/*Java OOP
Class & Object
A Class is a blueprint for creating objects.
An Object is real-world entity when a class is defined, no memory is allocated
but when an object is created memory is  allocated. 

Creating Class=>
class class_name{
you can create variables & functions here
}

Creating Object=>
class 
class_name object_name = new class_name();
*/

//Example of Class & Object
import java.util.Scanner;
//2
class AdmissionForm{
	String name;
	String fname;
	int age;
	public void filltheForm()
	{
		Scanner MyObj = new Scanner(System.in);
		
		System.out.println("Enter your name-");
		name=MyObj.nextLine();
		
		System.out.println("Enter your father name-");
		fname=MyObj.nextLine();
		
		System.out.println("Enter your age-");
		age=MyObj.nextInt();
	}
	public void showInfo()
	{
		System.out.println("Your name is-"+name);
		System.out.println("Your father name is-"+fname);
		System.out.println("Your age is-"+age);
	}
}
//1
public class Class_and_Obj_Example{
	public static void main(String args[]){
		AdmissionForm arpan = new AdmissionForm();
		arpan.filltheForm();
		arpan.showInfo();
	}
}
		
		
 
	