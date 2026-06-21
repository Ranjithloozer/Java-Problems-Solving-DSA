
public class Main
{
	public static void main(String[] args) {
	  String str = "GeeksforGeeks";

        System.out.println("Length: " + str.length());  
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Substring: " + str.substring(2, 6));
        
        
         String s = "Hello, World!";
        System.out.println(s.length());
        System.out.println(s.charAt(7));
        System.out.println(s.substring(7));
        System.out.println(s.substring(7, 12));
          System.out.println(s.concat("!!!"));
           System.out.println(s.indexOf("World"));
              System.out.println(str.indexOf("l", 4));
              System.out.println(s.lastIndexOf("l"));
               System.out.println(s.equals("Hello, World!"));
               
                       System.out.println(s.equalsIgnoreCase("hello, world!"));
                       
            System.out.println(s.compareTo("Hello, Java!"));
            System.out.println(s.compareToIgnoreCase("hello, Java!"));
             System.out.println(s.toUpperCase());
              System.out.println("'" + s.trim() + "'");
              
              String st = "   Hello, Trim!   ";
        System.out.println( st.trim() );
        
          System.out.println(s.replace('l', 'x'));
           System.out.println(s.contains("World"));
           
           
           
            String stri = "Hello";
        char[] chars = stri.toCharArray();
        for(char c : chars) {
            System.out.print(c + " ");
        }
        
        
        System.out.println(s.startsWith("Hello"));
        
    
    
	}
}
