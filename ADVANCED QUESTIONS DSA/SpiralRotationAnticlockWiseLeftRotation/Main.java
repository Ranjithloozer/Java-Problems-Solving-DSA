import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

	    Scanner in=new Scanner(System.in);
          
           int[][] a={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
           
          
           int r=a.length;
           int c=a[0].length;
           int[][] b=new int[c][r];
			int i,j;
			for(i=0;i<r;i++){
			    for(j=0;j<c;j++){
			        b[c-1-j][i]=a[i][j];
			    }
			}
			for(i=0;i<c;i++){
			for(j=0;j<r;j++){
			   	System.out.print(b[i][j]+" ");
		
			    }
			      System.out.println();
			    
				}
				
			
			
			
				
	}
}