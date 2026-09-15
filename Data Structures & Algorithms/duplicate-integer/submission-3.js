class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        const size = nums.length;
        if(size <= 1){
            return false;
        }
        nums.sort();
        let ans  = nums.at(0);
        for(let i=1; i<size; i++){
            ans = nums.at(i-1) ^ nums.at(i);
            console.log("index : ",i);
            console.log("ans : ",ans);
            if(ans == 0){
                return true;
            }
        }
        return false;
    }
}
