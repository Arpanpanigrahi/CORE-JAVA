/*File Handling:
Java has several methods for creating,reading, updating, and deleting files.
*/

//Creating & Writing data in file.
import java.io.FileOutputStream;
public class File_Example_1{
	public static void main(String args[]){
		try{
			FileOutputStream fout=new FileOutputStream("C:\\Users\\hp\\Desktop\\Java Programs\\testout.txt");
			String s="My name is Arpan Panigrahi";
			byte b[]=s.getBytes();//converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("success...");
		}catch(Exception e){System.out.println(e);}
	}
}
			