class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        int start = 0,end = len-1, mid = start;
        int min = Math.min(nums[start],nums[end]);
        while(start <= end){
            mid = (start + end)/2;
            System.out.println("nums[mid]" + nums[mid]);
            if(nums[mid]>=nums[start] && nums[mid]>nums[end]){
                start = mid+1;
            }else{
                 end = mid-1;
                 min = Math.min(min,nums[mid]);
            }
        }
        return min;
    }
}
