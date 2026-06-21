import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

	    Scanner in=new Scanner(System.in);
            
           System.out.println("Enter Matix : ");
           int r1=in.nextInt();
           int colu1=in.nextInt();
           System.out.println("Matrix  :");
           int r2=in.nextInt();
           int colu2=in.nextInt();
           
           if(colu1 != r2){
               System.out.print("not possible");
               return;
           }
			int[][] a=new int[r1][c];
	    	int[][] b=new int[r2][colu2];
			int[][] c=new int[r1][colu2];
			
		 System.out.println("Enter A Matix: ");
		for(int i=0;i<r1;i++){
		    for(int j=0;j<colu1;j++){
		        a[i][j]=in.nextInt();
		    }
		}
            System.out.println("Enter B Matix: ");
		 
			for(int i=0;i<r2;i++){
		    for(int j=0;j<colu2;j++){
		        b[i][j]=in.nextInt();
		    }
		}
		 System.out.println("After Multiplication");
			for(int i=0;i<r1;i++){
		    for(int j=0;j<colu2;j++){
		        for(int k=0;k<colu1;k++){
		            c[i][j]+=a[i][k]*b[k][j];
		        }
		        System.out.print(c[i][j]+" ");
		    }
		    System.out.println(" ");
		}
			
		
	}
}