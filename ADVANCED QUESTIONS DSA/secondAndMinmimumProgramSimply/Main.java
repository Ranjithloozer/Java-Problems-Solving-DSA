import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter:");
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++){
		    a[i]=in.nextInt();
		}
		int min=a[0],secMin=a[1];
	 for(int i=0;i<n;i++){
	     if(a[i]<min){
	         secMin=min;
	         min=a[i];
	     }else if(a[i]>min && a[i]<secMin){
	         	         secMin=a[i];
	     }
	 }
	 System.out.println(min);
	 	     System.out.print(secMin);
	}
}
