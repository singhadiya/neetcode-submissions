class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
        int length = nums.length;
        for(int i=0;i<length;i++){
            ans ^=i;
            ans^=nums[i];
        }
        ans ^=length;
        return ans;
    }
}
