import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int currentLen=0;
        if(nums.length==0){
            return 0;
        }
        for(int num:nums){
            set.add(num);
        }
        int current=0;
        int maxLength=0;
        for(int num:set){
            if(!set.contains(num-1)){
                  current=num;
                 currentLen=1;
            }
            while(set.contains(current+1)){
                current++;
                currentLen++;
            }
            maxLength=Math.max(maxLength,currentLen);
        }
          return maxLength;
    
    }
}
public class Main
{
	public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    
    int n=in.nextInt();
    
    int[] nums=new int[n];
    for(int i=0;i<nums.length;i++){
        nums[i]=in.nextInt();
    }
   
    Solution sol=new Solution();
    System.out.print(sol.longestConsecutive(nums));
	}
}
 