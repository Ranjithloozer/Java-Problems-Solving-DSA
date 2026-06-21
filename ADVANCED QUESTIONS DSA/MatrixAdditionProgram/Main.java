import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

	    Scanner in=new Scanner(System.in);
            
            System.out.print("Enter no rows: ");
            int r=in.nextInt();
            
             System.out.print("Enter no cols: ");
            int col=in.nextInt();
           
			int[][] a=new int[r][col];
	    	int[][] b=new int[r][col];
			int[][] c=new int[r][col];
		
		for(int i=0;i<r;i++){
		    for(int j=0;j<col;j++){
		        a[i][j]=in.nextInt();
		    }
		}
		
            System.out.println("Enter columns");
		 
			for(int i=0;i<r;i++){
		    for(int j=0;j<col;j++){
		        b[i][j]=in.nextInt();
		    }
		}
			for(int i=0;i<r;i++){
		    for(int j=0;j<col;j++){
		        c[i][j]=a[i][j]+b[i][j];
		        System.out.print(c[i][j]+" ");
		    }
		   
		    System.out.println(" ");
		}
			
		
	}
}