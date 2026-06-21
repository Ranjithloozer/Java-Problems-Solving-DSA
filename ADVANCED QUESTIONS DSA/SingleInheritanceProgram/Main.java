import java.util.Scanner;

class A{
    int a,b;
    public void getdata(){
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
    }
}
class Sum extends A{
    int c;
    public void Sum(){
        c=a+b;
        System.out.print("sum is:"+c);
    }
}



public class Main
{
	public static void main(String[] args) {
	    Sum obj=new Sum();
	    obj.getdata();
	    obj.Sum();
	}
}
