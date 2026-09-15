class Solution {
    public int search(int[] nums, int target) {

        int len = nums.length;
        int start =0, end = len-1, mid =0;

        while(start<=end){
            mid=(start+end)/2;
            System.out.println("mid : "+nums[mid]);
            if(nums[mid]>target){
                if(nums[start]>target && nums[start]<=nums[mid]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }else if(nums[mid]<target){
                if(nums[end]<target && nums[end]>=nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }

            }else{
                return mid;
            }

        }
        return -1;
    }
}
