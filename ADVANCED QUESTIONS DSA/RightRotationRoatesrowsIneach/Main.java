import java.util.Scanner;
public class Main
{
    public static void rightRota(int[] row,int k){
        int n=row.length;
       k=k%n;
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=row[n-k+i];
        }
         for(int i=n-k-1;i>=0;i--){
           row[i+k]=row[i];
        }
         for(int i=0;i<k;i++){
             row[i] =temp[i];
        }
    }
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter rows: ");
		int r=in.nextInt();
	   System.out.println("Enter cols: ");
	   int c=in.nextInt();
	   int[][] matrix=new int[r][c];
	  
	   for(int i=0;i<r;i++){
	       for(int j=0;j<c;j++){
	            matrix[i][j]=in.nextInt();
	       }
	   }
	   
	   for(int i=0;i<r;i++){
	        rightRota(matrix[i],i);
	   }

	   for(int i=0;i<r;i++){
	       for(int j=0;j<c;j++){
	           System.out.print(matrix[i][j]+" ");
	       }
	       System.out.println();
	   }

	}
}