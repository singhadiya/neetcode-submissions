class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number}
     */
    search(nums, target) {
        let ans = -1;
        let start = 0;
        let end = nums.length-1;
        let mid = 0;
        while(start<=end){
            mid = Math.trunc((start+end)/2);
            console.log("mid : ",mid, " :",nums[mid]);
            console.log("startindex",start);
            console.log("endIndex : ",end);
            if(nums[mid]>target){
                 if(nums[end]>=target && nums[start]>target && nums[mid] >=nums[end]){
                    start = mid+1;
                 }else{
                    end = mid-1;
                 }
            }else if(nums[mid]<target){
                if(nums[end]<target && nums[mid]<= nums[end]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                return mid;
            }
        }
        return ans;
    }
}
