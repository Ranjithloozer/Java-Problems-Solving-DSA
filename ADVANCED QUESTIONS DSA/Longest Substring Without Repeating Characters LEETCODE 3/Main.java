import java.util.*;
class Main {
    public static int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(set.contains(ch)){
                    break;
                }
                set.add(ch);
                max=Math.max(max,set.size());
            }
        }
        return max;
        
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
       System.out.print(lengthOfLongestSubstring(s));
    }
}