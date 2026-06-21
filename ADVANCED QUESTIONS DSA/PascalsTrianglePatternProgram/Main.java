import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int n,c=1;
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter number");
		n=in.nextInt();
	
	
	for(int i=0;i<n;i++){
		    for(int j=1;j<=n-i;j++){
		        System.out.print(" ");
		    }
		   for(int k=0;k<=i;k++){
		       if(k==0||i==0){
		           c=1;
		       }else{
		           c=c*(i-k+1)/k;
		       }
		       		System.out.print(" "+c);

		    }
		   System.out.println();
	}
	    
	}
}