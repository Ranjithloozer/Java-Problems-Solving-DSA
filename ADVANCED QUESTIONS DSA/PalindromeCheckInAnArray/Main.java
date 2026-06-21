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
		int i=0,j=n-1;
		boolean value=true;
		while(i<j){
		    if(a[i]!=a[j]){
		        value=false;
		        break;
		    }
		    i++;
		    j--;
		}
		if(value){
		    System.out.print("palindrome");
		}else{
		    System.out.print("not");
		}
	}
}
