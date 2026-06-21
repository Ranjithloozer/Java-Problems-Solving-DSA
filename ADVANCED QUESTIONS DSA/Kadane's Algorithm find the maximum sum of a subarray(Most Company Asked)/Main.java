class Solution {

    int maxSubarraySum(int[] arr) {
        int currSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
class Main{
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        Solution obj = new Solution();
        int result = obj.maxSubarraySum(arr);
        System.out.println("Maximum Subarray Sum = " + result);
    }
}