class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int current = 0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            current = Math.max(current+nums[i],nums[i]);
            max = Math.max(max,current);
        }
        System.out.println(max);
        return max;
        
    }
}
