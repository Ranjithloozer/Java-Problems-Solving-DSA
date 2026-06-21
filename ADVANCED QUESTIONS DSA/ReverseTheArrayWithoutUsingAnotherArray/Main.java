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
        int	i=0;
        int	j=n-1;
	       while(i<j){
		          int temp=a[i];
		        a[i]=a[j];
		        a[j]=temp; 
		        i++;
		        j--;
		}
		
		for(i=0;i<n;i++){
		    		    System.out.print(a[i]+" ");

		}
		
	}
}
