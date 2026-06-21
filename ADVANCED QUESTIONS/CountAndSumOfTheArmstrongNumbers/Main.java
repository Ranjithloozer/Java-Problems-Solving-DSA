import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	int n=in.nextInt();
		int count=0,totalsum=0;
	for(int i=1;i<=n;i++){
	    int temp=i;
	    
int digit=0;int sum=0;
	while(temp!=0){
	    digit++;
	    temp/=10;
	}
	temp=i;
	while(temp!=0){
	    int rem=temp%10;
	    sum+=Math.pow(rem,digit);
	    temp/=10;
	    
	}
      if(sum==i){
	    count++;
	    totalsum+=i;
	}
	

	}
	System.out.println(count);
	System.out.print(totalsum);
		

	}
}
