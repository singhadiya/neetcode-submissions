class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        int length = nums.length;
        for(int i=0;i<length;i++){
            List<List<Integer>>curr = new ArrayList<>(ans);
            ans.clear();
            for(List<Integer>c : curr){
                int position = c.size();
                for(int j=0; j<=position; j++){
                    List<Integer>temp = new ArrayList<>(c);
                    temp.add(j,nums[i]);
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}
