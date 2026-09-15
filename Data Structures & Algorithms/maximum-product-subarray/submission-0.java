class Solution {
    public int maxProduct(int[] nums) {
       int length = nums.length;
       if(length == 1) return nums[0];

       int ans = nums[0];
       int min = nums[0];
       int max = nums[0];
       for(int i=1;i<length;i++){
        if(nums[i]==0){
            min = 1;
            max = 1;
        }
        int newMin = Math.min(max*nums[i],Math.min(nums[i],min*nums[i]));
        int newMax = Math.max(max*nums[i],Math.max(nums[i],min*nums[i]));
        if(ans<newMax){
            ans = newMax;
        }
        min = newMin;
        max = newMax;
       }
       return ans;
        
    }
}
