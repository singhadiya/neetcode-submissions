class Solution {
    public int rob(int[] nums) {
        int rob1=0,rob2=0,max=0,temp=0;
        int len = nums.length;
        if(len==1){
            return nums[0];
        }
        for(int i=0;i<len-1;i++){
            temp = Math.max(rob1+nums[i],rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        max = rob2;
        rob1=0;
        rob2=0;
        for(int i=1;i<len;i++){
            temp = Math.max(rob1+nums[i],rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return Math.max(max,rob2);
    }
}
