import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("");
		int[] a={10,3,4,5,-9,6};
		int max=a[0];
		int secMax=a[1];
		for(int i=1;i<a.length;i++){
		    if(a[i]>max){
		        max=a[i];
		        
		    }
		    else if(a[i]>=secMax){
		        secMax=a[i];
		    }
      		      
		}
				  
             System.out.println(secMax);
	}
}
