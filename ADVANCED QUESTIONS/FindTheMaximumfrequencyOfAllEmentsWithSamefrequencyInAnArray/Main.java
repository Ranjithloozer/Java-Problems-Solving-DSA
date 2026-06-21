import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter");
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=in.nextInt();
		}
		  int max=0;
		for(int i=0;i<n;i++){
		    int count=0;
		    for(int j=0;j<n;j++){
		        if(a[i]==a[j]){
		            count++;
		        }
		    }
		    		       
		    if(count>max){
		        max=count;
		    }
		    
		}
			  for(int i = 0; i < n; i++){

            boolean visited = false;

            for(int k = 0; k < i; k++){
                if(a[i] == a[k]){
                    visited = true;
                    break;
                }
            }

            if(visited) continue;

            int count = 0;

            for(int j = 0; j < n; j++){
                if(a[i] == a[j]){
                    count++;
                }
            }

            if(count == max){
                System.out.print(a[i] + " ");
            }
            
			  }

	}
}
