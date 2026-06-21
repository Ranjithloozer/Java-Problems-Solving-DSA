import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter:");
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
		    boolean value=false;
	   for(int k=0;k<i;k++){
	    if(a[i] == a[k]){
	       value = true;
	       break;
	   }
	}
	if(value){
	    continue;
	}
	   int count=0;
		for(int j=0;j<n;j++){
		    if(a[i]==a[j]){
		        		    count++;

		    }
		}
		    System.out.println(a[i]+"->"+count);
	
		}
	}
}
