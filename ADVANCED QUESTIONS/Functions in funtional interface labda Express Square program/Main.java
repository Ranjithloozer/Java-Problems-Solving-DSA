//Functions in funtional interface
import java.util.function.Function;
public class Main
{
	public static void main(String[] args) {
		Function<Integer,Integer> square =num->num*num;
		System.out.println(square.apply(5));
		System.out.println(square.apply(10));
	}
}
