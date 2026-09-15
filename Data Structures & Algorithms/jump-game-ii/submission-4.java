class Solution {
    public int jump(int[] nums) {
        int l=0,r=0,res=0;
        int farthest = 0;
        int len = nums.length;
        while(r<nums.length-1){
            farthest = 0;
            for(int i=l; i<=r; i++){
                farthest = Math.max(farthest,i+nums[i]);
            }
            res++;
            l=r+1;
            r=farthest;
        }
        return res;
    }   
}
