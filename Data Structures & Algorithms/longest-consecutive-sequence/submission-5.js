class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    longestConsecutive(nums) {
        const length = nums.length;
        if(length <2){
            return length;
        }
        let set = new Set(nums);
        let arr = [];
        set.forEach((v)=>arr.push(v));
         console.log("arr1 : ",arr);
        
       arr.sort((a,b)=>a-b);
       console.log("arr2 : ",arr);
        let i=1;
        let max = 0;
        let current = 1;
        while(i<length){
             if(arr[i]===arr[i-1]+1){
                current++;
                if(i==length-1){
                    return Math.max(max,current);
                }
             }else{
                max = Math.max(max,current);
                current=1;
             }
             i++;
        }
        return max;

    }
}
