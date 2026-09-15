class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>m = new HashMap<>();
        int[] ans = new int[2];
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(m.containsKey(target-nums[i])){
                ans[0] = m.get(target-nums[i]);
                ans[1] = i;
                break;
            }else{
                m.put(nums[i],i);
            }
        }
        return ans;
    }
}
