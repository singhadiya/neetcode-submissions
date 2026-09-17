class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        Set<Integer>s = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int target = -1*nums[i];
            s.clear();
            for(int j=i+1;j<nums.length;j++){
                if(s.contains(target-nums[j])){
                    ans.add(Arrays.asList(nums[i],target-nums[j],nums[j]));
                }else{
                    s.add(nums[j]);
                }
            }
        }
        Set<String>set = new HashSet<>();
        for(int j=ans.size()-1;j>=0;j--){
            Collections.sort(ans.get(j));
           String data = ans.get(j).toString();
           if(set.contains(data)){
            ans.remove(j);
           }else{
            set.add(data);
           }
        }
        return ans;
    }
}
