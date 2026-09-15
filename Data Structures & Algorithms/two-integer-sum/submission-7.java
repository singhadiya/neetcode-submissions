class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        Map<Integer,Integer>m = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(m.containsKey(target-num)){
                ans[0] = m.get(target-num);
                ans[1] = i;
                return ans;
            }else{
                m.put(num,i);
            }
        }
        return null;   
    }
}
