class Solution {
    private List<List<Integer>>ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(0,candidates,new ArrayList<>(),target);
        return ans;
    }

    public void dfs(int index,int[]candidates,List<Integer>data,int target){
        if(target == 0){
            ans.add(new ArrayList<>(data));
            return;
        }
        if(index >= candidates.length || target < 0) return ;
        data.add(candidates[index]);
        dfs(index+1,candidates,data,target-candidates[index]);
        data.remove(data.size()-1);
        while(index<(candidates.length-1) && candidates[index] == candidates[index+1]){
            index++;
        }
        dfs(index+1,candidates,data,target);
    }
}
