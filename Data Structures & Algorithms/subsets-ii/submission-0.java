class Solution {
    List<List<Integer>>ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(0,new ArrayList<>(),nums);
        return ans;
    }

    public void dfs(int index,List<Integer>data,int[]nums){
        if(index == nums.length){
           ans.add(new ArrayList<>(data));
           return;
        } 
        data.add(nums[index]);
        dfs(index+1,data,nums);
        data.remove(data.size()-1);
        while(index<nums.length-1 && nums[index] == nums[index+1]){
            index++;
        }
        dfs(index+1,data,nums);
    }
}
