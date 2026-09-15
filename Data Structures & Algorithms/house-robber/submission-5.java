class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if(length == 1 ) return nums[0];
        if(length == 2 ) return Math.max(nums[0],nums[1]);
        if(length == 3 ) return Math.max(nums[0]+nums[2],nums[1]);
        // int []dp = new int[length];
        int third = nums[0];
        int second = Math.max(nums[0],nums[1]);
        int first = Math.max(nums[0]+nums[2],nums[1]);
        int temp = 0;
        for(int i = 3; i< length; i++){
           temp = first; 
            first = Math.max(nums[i]+second,nums[i]+third);
            third = second;
            second = temp;
        } 
        return Math.max(first,second);
    }
}
