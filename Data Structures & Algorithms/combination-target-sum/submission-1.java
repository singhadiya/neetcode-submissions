class Solution {
    private List<List<Integer>>ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        dfs(0,nums,new ArrayList<>(),target);
        return ans;
    }

    public void dfs(int index,int[] nums,List<Integer>data,int target){
        
        if(target<0 || index == nums.length) return;
        if(target==0){
            ans.add(new ArrayList<>(data));
            return;
        }
        
        data.add(nums[index]);
        dfs(index,nums,data,target-nums[index]);
        data.remove(data.size()-1);
        dfs(index+1,nums,data,target);
    }
}
