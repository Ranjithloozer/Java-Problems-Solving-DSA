//Without Used lambda expression
@FunctionalInterface
interface Greeting{
    void sayHello();
}
public class Main
{
	public static void main(String[] args) {
		Greeting g=new Greeting(){
		    @Override
		    public void sayHello(){
		        System.out.println("Hello Student");
		    }
		};
		g.sayHello();
	}
}

// With Using Lambda Expression So compare with above its reduce the lines of codes

@FunctionalInterface
interface Greeting{
    void sayHello();
}
public class Main
{
	public static void main(String[] args) {
		Greeting g=()->System.out.print("Welcome");
		g.sayHello();
	}
}

