import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String s = in.nextLine();

        for (int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            if (ch==' ')
               continue;
            boolean a=false;
            for (int k=0;k<i;k++) {
                if (s.charAt(k)==ch) {
                    a=true;
                    break;
                }
            }
            if(a)
            continue;
            int count=0;
            for (int j=0;j<s.length();j++) {
                if (s.charAt(j)==ch) {
                    count++;
                }
            }
            System.out.println(ch + " " +count);
        }
    }
}
