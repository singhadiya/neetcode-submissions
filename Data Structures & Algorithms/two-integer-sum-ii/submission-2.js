class Solution {
    /**
     * @param {number[]} numbers
     * @param {number} target
     * @return {number[]}
     */
    twoSum(numbers, target) {
        let start=0;
        let end = numbers.length-1;
        let current = 0;
        while(start<end){
            current = numbers.at(start) + numbers.at(end);
            if(current < target){
                start++;
            }else if(current > target){
                end--;
            }else{
                return [start+1,end+1];
            }
        }
        return [1,2];
    }
}
