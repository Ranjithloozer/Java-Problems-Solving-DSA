//Predicate in funtional interface for positive or negative checking
import java.util.function.Predicate;
public class Main
{
	public static void main(String[] args) {
		Predicate<Integer> check =num->num>=0; 
		System.out.println(check.test(5));
		System.out.println(check.test(-2));
	}
}
