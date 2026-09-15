class Solution {
    public int lengthOfLIS(int[] nums) {
        int ans = 1;
        int length = nums.length;
        if(length == 1) return 1;
        int[]dp = new int[length];
        dp[length-1]=1;
        for(int i=length-2;i>=0;i--){
            dp[i]=1;
            for(int j=i;j<length;j++){
                if(nums[j]>nums[i]&&dp[j]>=dp[i]){
                    dp[i] = dp[j]+1;
                }
                if(dp[i]>ans){
                    ans = dp[i];
                }
            }
        }
        return ans;
    }
}
