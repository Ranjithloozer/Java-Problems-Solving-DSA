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
		int max=0,maxElement=0;   
		int secmax=0,secmaxElement=0;
		for(int i=0;i<n;i++){
				int count=0;
				boolean visited = false;

        for(int k=0;k<i;k++){
         if(a[i] == a[k]){
           visited = true;
            break;
          }
          }
       if(visited){
      continue;
    }
		    for(int j=0;j<n;j++){
		        if(a[i]==a[j]){
		            count++;
		        }
		    }
		    if(count>max){
		        secmax=max;
		        secmaxElement=maxElement;
		        max=count;
		        maxElement=a[i];
		    }else if(count<max && count>secmax){
		        secmax=count;
		        secmaxElement=a[i];
		    }
		}
		
		    System.out.print(secmaxElement);
		
	}
}
