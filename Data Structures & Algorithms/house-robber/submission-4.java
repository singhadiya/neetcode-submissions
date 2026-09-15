class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if(length == 1 ) return nums[0];
        if(length == 2 ) return Math.max(nums[0],nums[1]);
        if(length == 3 ) return Math.max(nums[0]+nums[2],nums[1]);
        int []dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        dp[2] = Math.max(nums[0]+nums[2],nums[1]);
        for(int i = 3; i< length; i++){
            dp[i] = Math.max(nums[i]+dp[i-2],nums[i]+dp[i-3]);
        } 
        return Math.max(dp[length-1],dp[length-2]);
    }
}
