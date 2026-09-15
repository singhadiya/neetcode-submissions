class Solution {
    public int rob(int[] nums) {
       int rob1=0, rob2=0;
       int len = nums.length;
       int temp=0;
       for(int i=0; i<len; i++){
           temp = Math.max(rob1 + nums[i],rob2);
           rob1 = rob2;
           rob2 = temp;
       }
       return rob2;
        
    }

    public int totalMoney(int index,int money,int[]nums){
        if(index>=nums.length) return money;
        return Math.max(totalMoney(index+2,money+nums[index],nums),totalMoney(index+1,money,nums));
    }
}
