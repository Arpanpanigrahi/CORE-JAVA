abstract class A{
	public void f1(){
		System.out.println("I am f1 function");
	}
}
//without this it will show error
class B extends A{
	

}

public class Example_Abstract_Class{
	public static void main(String args[]){
		//A obj = new A();
		B obj = new B();
		obj.f1();
	}
}