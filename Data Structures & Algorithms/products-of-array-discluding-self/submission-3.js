class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    productExceptSelf(nums) {
        // let length = nums.length;
        // let left = new Array(length).fill(1);
        // let right = new Array(length).fill(1);
        // for(let i=1; i<length;i++){
        //     left[i] = left[i-1]*nums[i-1];
        // }
        // for(let i=length-2; i>=0; i--){
        //     right[i] = right[i+1]*nums[i+1];
        // }
        // let ans = [];
        // for(let i=0; i<length; i++){
        //     ans.push(left[i]*right[i]);
        // }
        // return ans;

        let length = nums.length;
        let ans = new Array(length).fill(1);
        // let right = new Array(length).fill(1);
        for(let i=1; i<length;i++){
            ans[i] = ans[i-1]*nums[i-1];
        }
        console.log("ans : ",ans);
         let prefix = 1
        for(let i=length-1; i>=1; i--){
            ans[i-1] *= nums[i]*prefix;
            prefix *= nums[i];
            console.log("inside : ",ans);

        }
        // let ans = [];
        // for(let i=0; i<length; i++){
        //     ans.push(left[i]*right[i]);
        // }
        return ans;
    }
}
