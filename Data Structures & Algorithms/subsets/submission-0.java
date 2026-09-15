class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>>ans = new ArrayList<>();
        int len = nums.length;
        // total subsets = 2^len;
        int totalsubsets = 1<<len;

        for(int j=0; j<totalsubsets; j++){
            List<Integer>temp = new ArrayList<>();
            for(int i=0;i<len;i++){
                if((j & (1<<i)) != 0){
                    temp.add(nums[i]);
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
