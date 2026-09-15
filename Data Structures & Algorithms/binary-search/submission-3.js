class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number}
     */
    search(nums, target) {
        let start = 0;
        let end = nums.length-1;
        let mid = 0;
        while(start <= end){
            mid = Math.trunc((start + end)/2);
            console.log("mid : ",mid);
            if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]>target){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
