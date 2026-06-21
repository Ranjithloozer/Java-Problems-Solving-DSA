import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter the search Element");
		n=in.nextInt();
		int[] a={1,4,6,2,5,8,9};
		boolean value=false;
		for(int i=0;i<a.length;i++){
		   if(a[i]==n){
		       value=true;
		       break;
		   }
		}
		   
		   if(value){
		       System.out.print("Element found");
		   }
		   else{
		   System.out.print("Not found");
		 
 
		   }
		
		
	}
}