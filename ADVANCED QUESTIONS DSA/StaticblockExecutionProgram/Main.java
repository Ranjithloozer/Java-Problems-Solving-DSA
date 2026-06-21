class Example{
    static int count;
    
    static{  //static initialzer
        count=0;
        System.out.println("static members initialized");
    }
    Example(){
        count++;
    }
    
     static void disp(){  //static method
        		System.out.println("objects:"+count);

    }
}
public class Main
{
	public static void main(String[] args) {
	    
	    System.out.println("drivers class started");
	    Example obj1=new Example();
	    Example obj2=new Example();
	    Example obj3=new Example();
	    Example.disp();    //classname.methodName

	}
}
