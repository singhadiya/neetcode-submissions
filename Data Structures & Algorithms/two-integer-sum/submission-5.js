class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        let map = new Map();
        const length = nums.length;
        for(let i=0; i<length; i++){
            if(map.has(target-nums[i])){
                return [map.get(target-nums[i]),i];
            }else{
                map.set(nums[i],i);
            }
        }
    }
}
