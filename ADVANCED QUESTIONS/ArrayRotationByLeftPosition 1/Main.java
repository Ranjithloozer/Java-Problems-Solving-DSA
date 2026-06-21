import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter:");
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=in.nextInt();
		}
		 int temp=a[0];
		for(int i=0;i<n-1;i++){
		   a[i]=a[i+1];
		   
		}
		 a[n-1]=temp;
		 for(int i=0;i<n;i++){
		     System.out.print(a[i]+" ");
		 }
	}
}
