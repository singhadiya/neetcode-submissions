class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(nums[Math.abs(nums[i])-1]<0){
                return Math.abs(nums[i]);
            }else{
                nums[Math.abs(nums[i])-1] *= -1; 
            }
        }
        return 0;
    }
}
