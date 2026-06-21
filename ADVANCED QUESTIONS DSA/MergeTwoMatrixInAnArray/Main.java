import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.print("Enter: ");
		int n=in.nextInt();
		int[] a=new int[n];
	    int[] b=new int[n];
	    int[] c=new int[a.length+b.length];
	    System.out.println("Enter a:");
	    for(int i=0;i<a.length;i++){
	        a[i]=in.nextInt();
	        c[i]=a[i];
	    }
	    	    System.out.println("Enter b:");

	    for(int j=0;j<b.length;j++){
	        b[j]=in.nextInt();
	        c[a.length+j]=b[j];
	    }
	    for(int k=0;k<c.length;k++){
	        System.out.print(c[k]+" ");
	    }
	}
	
}
