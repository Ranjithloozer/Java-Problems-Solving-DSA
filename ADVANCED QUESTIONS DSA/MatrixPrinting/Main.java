import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

	    Scanner in=new Scanner(System.in);
        int r,c;
	   System.out.println("Enter the number of rows");
    		r=in.nextInt();
    		
	System.out.println("Enter the number of columns");
	   c=in.nextInt();
	   
			int[][] a=new int[r][c];
		
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        a[i][j]=in.nextInt();
		    }
		}
			for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println(" ");
		}
	}
}