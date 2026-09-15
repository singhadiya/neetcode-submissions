class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int [] ans  = new int[2];
        HashMap<Integer,Integer> mapper = new HashMap<>();
        for(int i=0;i<len;i++){
            if(mapper.containsKey(target-nums[i]) && i != mapper.get(target-nums[i])){
                // System.out.println("i : "+i);
                // System.out.println("nums[i] : "+nums[i]);
                // System.out.println("mapper.get(target-nums[i]) : "+mapper.get(target-nums[i]));
                // System.out.println("Mapper : "+mapper);
                ans[1] = i;
                ans[0] = mapper.get(target-nums[i]);
                break;
            }else{
                mapper.put(nums[i],i);
            }
        }
        return ans;
    }
}
