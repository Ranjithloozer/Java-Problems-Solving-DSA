import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	int rev=0;
	int n;
	Scanner in=new Scanner(System.in);
	System.out.print("Enter the number :");
	n=in.nextInt();
	while(n!=0)
	{
	    rev=rev*10+n%10;
	    n/=10;
	}
		
		System.out.println(rev);
	}
}
