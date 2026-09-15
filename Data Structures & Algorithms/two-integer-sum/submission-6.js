class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        let map = new Map();
        let ans = [];
        const length = nums.length;
        for(let i=0; i<length; i++){
            if(map.has(target-nums[i])){
                ans =  [map.get(target-nums[i]),i];
                break;
            }else{
                map.set(nums[i],i);
            }
        }
        return ans;
    }
}
