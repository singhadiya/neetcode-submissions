class Solution {
    /**
     * @param {number[]} numbers
     * @param {number} target
     * @return {number[]}
     */
    twoSum(numbers, target) {
        let length = numbers.length;
        let start = 0;
        let end = length - 1;
        while(start < end){
            if(numbers.at(start) + numbers.at(end) > target){
                end--;
            }else if(numbers.at(start) + numbers.at(end) < target){
                start++;
            }else{
                return [start+1,end+1];
            }
        }
    }
}
