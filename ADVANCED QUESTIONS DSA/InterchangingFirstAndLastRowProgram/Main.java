import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    
	    	System.out.println("Enter 1");
	    	int r=in.nextInt();
	    	System.out.println("Enter 2"); 
	    	int c=in.nextInt();
	    	
	    	int[][] a=new int[r][c];
	    	int temp;
	    	for(int i=0;i<r;i++){
	    	    for(int j=0;j<c;j++){
	    	        a[i][j]=in.nextInt();
	    	    }
	    	}
	    	for(int i=0;i<r;i++){
	    	     temp=a[0][i];
	    	    a[0][i]=a[r-1][i];
	    	    a[r-1][i]=temp;
	    	}
	    	for(int i=0;i<r;i++){
	    	    for(int j=0;j<c;j++){
	    	        System.out.print(a[i][j]+" ");
	    	    }
	    	    System.out.println(" ");
	    	}
	    
	
	}
}
