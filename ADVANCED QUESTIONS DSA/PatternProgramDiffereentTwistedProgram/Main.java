import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter: ");
		int n=in.nextInt();
	  
	   for(int i=0;i<=n;i++){
	       for(int j=0;j<i;j++){
	      if((i+j)%2==0){
	          System.out.print("0");
	      }else{
	          System.out.print("1");
	      }
	       }
	       System.out.println("");
	   }
		
	}
}
