class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    findMin(nums) {
        let start = 0;
        let end = nums.length-1;
        let mid =0;
        while(start <= end){
            mid = Math.trunc((start + end)/2);
            console.log("mid : ",nums[mid]);
            if(nums[mid]>nums[nums.length-1]){
                start = mid+1;
            }else{
                if(nums[mid]<nums[mid-1]){
                    return nums[mid];
                }
                end = mid-1;
            }
        }
        return nums[mid];
    }
}
