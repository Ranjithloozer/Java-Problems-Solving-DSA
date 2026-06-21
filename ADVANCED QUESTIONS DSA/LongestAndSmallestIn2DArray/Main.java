import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {

	    Scanner in=new Scanner(System.in);
            
           System.out.println("enter 1 : ");
           int r=in.nextInt();
           System.out.println("enter 2 : ");
            int c=in.nextInt();
           int i,j;
			int[][] a=new int[r][c];
			for(i=0;i<r;i++){
			    for(j=0;j<c;j++){
			        a[i][j]=in.nextInt();
			    }
			}
			int max=a[0][0];
			int min=a[0][1];
				for(i=0;i<r;i++){
			    for(j=0;j<c;j++){
			       if(a[i][j]>max){
			          max=a[i][j];
			       }
			       else if(a[i][j]<min){
			          min=a[i][j];
			          
			       }
			    }
				}
			 System.out.println("longest :"+max);
		   System.out.println("Smallest :"+min);
				
	}
}