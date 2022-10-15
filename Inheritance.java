/*Inheritance:
Syntax:
class Subclass-name extends Superclass-name
{
	//methods
}

Types of inheritance:
1>Single Inheritance=>  Class A --------> Class B

2>Multilevel Inheritance=> Class A ----> Class B ----> Class C

Note: Java does not support Multiple Inheritance using classes.

3>Hierachial Inheritance=>
                          Class A (f1f2())
			Class B (f1())                Class C (f2())
*/

//Inheritance Example
class A{
	public int x,y,z;
	public void sum(int a, int b){
		x=a;
		y=b;
		z=x+y;
		System.out.println(z);
	}
}
class B extends A{
	public void multi(int a, int b){
		x=a;
		y=b;
		z=x*y;
		System.out.println(z);
	}
}	
//1
public class Inheritance{
	public static void main(String args[]){
		B obj = new B();
		obj.sum(2,3);
		obj.multi(4,2);
	}
}