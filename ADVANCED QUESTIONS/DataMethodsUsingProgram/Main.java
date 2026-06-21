class Example{
    static int count=0;
    Example(){
        count++;
    }
    
    public static void disp(){  //static method
        		System.out.println("objects:"+count);

    }
}
public class Main
{
	public static void main(String[] args) {
	    Example obj1=new Example();
	    Example obj2=new Example();
	    Example obj3=new Example();
	    Example.disp();    //classname.methodName

	}
}
