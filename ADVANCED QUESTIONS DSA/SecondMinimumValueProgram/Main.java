import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("");
		int[] a={10,3,4,5,-9,6};
		int min=a[0];
		int secMin=a[1];
		for(int i=1;i<a.length;i++){
		    if(a[i]<min){
		         secMin=min;
		        min=a[i];
		    }
      		      
		}
				  
             System.out.println(secMin);
	}
}
