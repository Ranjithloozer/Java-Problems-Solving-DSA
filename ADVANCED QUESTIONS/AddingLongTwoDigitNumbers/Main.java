import java.util.Scanner;
import java.Math.BigInteger;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter number: ");
		String num1=in.nextLine();
	    System.out.println("Enter number: ");
		String num2=in.nextLine();
		
		BigInteger a=new BigInteger(num1);
		BigInteger b=new BigInteger(num2);
		
		BigInteger sum=a.add(b);
		System.out.print(sum);
		


	
	}
}
