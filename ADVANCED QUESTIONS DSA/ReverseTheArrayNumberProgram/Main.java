import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("enter number");
		int a[]={5,3,9,1,6};
		int i,j;
		for(i=a.length-1,j=0;i<=0;i++,j--)
		
		{
		    a[j]=a[i];
		    	
		}
		    System.out.print(a[j]+",");
		
		
		/*  another method to print reverese 
		
		for( i=0;i<a.length;i++){
        	for( j=i+1;j<a.length;j++){
		            int temp=a[i];
		            a[i]=a[j];
		            a[j]=temp;
        	}
        		System.out.print(a[i]+",");
		    
        	}
        	*/
        	
        	
        	
	}
}