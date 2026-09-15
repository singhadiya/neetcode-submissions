class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int [] ans = new int[len];
        if(len==2){
            ans[0] = nums[1];
            ans[1] = nums[0];
            return ans;
        }
        ans[0] = 1;
        ans[1] = nums[0];
        for(int i=2;i<len;i++){
             ans[i] = nums[i-1]*ans[i-1];
        }
        int [] ans2 = new int[len];

        ans2[len-1] = 1;
        ans2[len-2] = nums[len-1];
        for(int i=len-3;i>=0;i--){
            ans2[i] = ans2[i+1]*nums[i+1];
        }
        int []a = new int[len];
        for(int i=0;i<len;i++){
            a[i] = ans[i]*ans2[i]; 
        }
        return a;    
    }
}  
