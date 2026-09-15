class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        if(len == 2){
            int [] res = new int[2];
            res[0] = nums[1];
            res[1] = nums[0];
            return res;
        }
        int [] left = new int[len];
        int [] right = new int[len];
        left[0] = 1;
        left[1] = nums[0];
        for(int i=2;i<len;i++){
           left[i] = left[i-1]*nums[i-1];
        }

        right[len-1] = 1;
        right[len-2] = nums[len-1];
        for(int i=len-3; i>=0;i--){
            right[i] = right[i+1]*nums[i+1];
        }
        

        // result array
        int [] res = new int[len];
        for(int i=0;i<len;i++){
            res[i] = left[i]*right[i];
        }
        return res;
    }
}  
