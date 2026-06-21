import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	System.out.print("enter size:");
	int n=in.nextInt();
	int[] a=new int[n];
	int max=1;
	int curLength=1;
	int temp=0;
	int start=0;
	System.out.print("enter elemnts: ");
	for(int i=0;i<a.length;i++){
	    a[i]=in.nextInt();
	}
	
	for(int i=1;i<a.length;i++){
	    if(a[i]>a[i-1]){
	        curLength++;
	    }else{
	        curLength=1;
	        temp=i;
	    }
	   
	   if(curLength>max){
	       max=curLength;
	       start=temp;
	   }
	}
	System.out.println("Longest Increasing Subarray:");
	
	for(int i=start;i<start+max;i++){
	    System.out.print(a[i]+" ");
	}
		
	}
}
