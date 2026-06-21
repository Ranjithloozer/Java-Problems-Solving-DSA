
import java.util.*;
public class Main
{
	public static void main(String[] args) {

		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        // Adding key-value pairs
        lhm.put("Apple", 50);
        lhm.put("Banana", 30);
        lhm.put("Mango", 70);
        lhm.put("Orange", 40);
        
        System.out.println(lhm);
	}
}
