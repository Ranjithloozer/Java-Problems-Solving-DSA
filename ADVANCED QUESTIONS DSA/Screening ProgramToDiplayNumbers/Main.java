
public class Main
{
	public static void main(String[] args) {
	    
	   int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	   
	   int top=0;
	   int bot=matrix.length-1;
	   int l=0;
	   int r=matrix[0].length-1;
	   
	   while(top<=bot && l<=r){
	       
	       for(int i=l;i<=r
	       ;i++)
	           System.out.print(matrix[top][i]+" ");
	           top++;
	       
	       for(int i=top;i<=bot;i++)
	           System.out.print(matrix[i][r]+" ");
	           r--;
	           if(top<=bot){
	               for(int i=r;i>=l;i--)
	                   	           System.out.print(matrix[bot][i]+" ");
	                   	           bot--;
	               if(l<=r){
	                   for(int i=bot;i>=top;i--)
	           System.out.print(matrix[i][l]+" ");
	           l++;
	               }
	           }
	       
	   }
	   
	}
}
