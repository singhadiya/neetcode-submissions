class Solution {
    public boolean canPartition(int[] nums) {
        boolean result = false;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        if(sum%2 == 1) return result;

        int target = sum/2;
        
        int length = nums.length;
        for(int i=1;i<Math.pow(2,length);i++){
            int curr = i;
            int index = 0;
            sum = 0;
            List<Integer>temp = new ArrayList<>();
            while(curr > 0){
                if((curr & 1)==1){
                    sum+=nums[index];
                    if(sum == target) return true;
                }
                curr = curr>>1;
                index++;
            }
        }
        return false;
    }
    
}
