class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        let map = new Map();
        for(let i=0; i<nums.length; i++){
            map.set(nums.at(i),i);
        }
        console.log("map : ",map);
        for(let i=0; i<nums.length; i++){
            if(map.has(target-nums.at(i)) && i !==map.get(target-nums.at(i))){
                return [i,map.get(target-nums.at(i))];
            }
        }
        return [0,0];
    }
}
