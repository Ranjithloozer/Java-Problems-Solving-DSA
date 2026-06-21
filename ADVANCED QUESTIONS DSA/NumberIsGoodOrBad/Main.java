import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int temp=n;
		int sum=0;
		while(temp!=0){
		   int rem=temp%10;
		   sum=sum+rem;
		   temp/=10;
		}
		if(n%sum==0){
		    System.out.println("good number");
		}else{
		    System.out.println("bad number");
		}
	}
}
