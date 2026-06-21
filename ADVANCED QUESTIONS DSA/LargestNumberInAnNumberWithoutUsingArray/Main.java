import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter: ");
		int n=in.nextInt();
        int max=0;
       while(n!=0){
         int digits=n%10;
         if(digits>max){
           max=digits;
          }
          n/=10;
        }
   System.out.print(max);
	  }

}
