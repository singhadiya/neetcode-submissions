class Solution {
    public boolean canJump(int[] nums) {
        return jumped(nums,0);  
    }

    public boolean jumped(int[] nums,int i){
        int len = nums.length;
        while(i<len-1 && nums[i]>0){
               for(int j=1;j<=nums[i];j++){
                    if(jumped(nums,i+j)){
                        return true;
                    }
               }
               i+=nums[i];
        }
        if(i>=len-1) return true;
        return false;

    }
}
