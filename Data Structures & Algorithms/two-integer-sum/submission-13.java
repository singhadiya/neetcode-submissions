class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        if(length == 2) return new int[]{0,1};
        Map<Integer,Integer>s = new HashMap<>();
        for(int i=0; i<length; i++){
            int num = nums[i];
            if(s.containsKey(target-num)){
                return new int[]{s.get(target-num),i};
            }
            s.put(num,i);
        }
        return new int[]{};
        
    }
}
