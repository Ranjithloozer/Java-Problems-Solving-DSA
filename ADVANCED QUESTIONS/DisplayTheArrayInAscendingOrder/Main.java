import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.print("Enter: ");
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++){
		    a[i]=in.nextInt();
		}
		
		for(int i=0;i<a.length;i++){
		    for(int j=i+1;j<a.length;j++){
		        if(a[i]>a[j]){
		            int temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
		        }
		    }
		    System.out.print(a[i]);
		}
	}
	
}
