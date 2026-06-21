import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

	    Scanner in=new Scanner(System.in);
            
           System.out.println("enter 1 : ");
           int r=in.nextInt();
           System.out.println("enter 2 : ");
            int c=in.nextInt();
           int i,j,sum=0;
			int[][] a=new int[r][c];
			for(i=0;i<r;i++){
			    for(j=0;j<c;j++){
			        a[i][j]=in.nextInt();
			        sum=sum+a[i][j];
			    }
			}
			System.out.print("sum :"+sum);
	}
}