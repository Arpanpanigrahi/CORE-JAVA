public class Nested_For{
	public static void main(String args[]){
		int i,j;
		for(i=0;i<=5;i++){ //outer for-loop
			for(j=0;j<=i;j++){ //inner for-loop
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}