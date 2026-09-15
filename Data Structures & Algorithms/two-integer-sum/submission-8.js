class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        let map = new Map();
        const ans = [];
        for(let i=0; i<nums.length;i++){
            if(map.has(target-nums[i])){
                ans.push(map.get(target-nums[i]))
                ans.push(i);
                break;
            }else{
                map.set(nums[i],i);
            }
            console.log("map : ",map);
        }
        return ans;
    }
}
