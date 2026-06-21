import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter:");
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0; i<a.length; i++) {
			a[i]=in.nextInt();
		}
 
	   for(int i=0;i<n-1;i++){
        if(a[i+1] - a[i] != 1){
         System.out.print(a[i] + 1);
    }
    }
		
			

	}
}
