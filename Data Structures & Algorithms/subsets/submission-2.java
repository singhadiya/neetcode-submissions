class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        int length = nums.length;
        ans.add(new ArrayList<>());
        for(int i=1;i<Math.pow(2,length);i++){
            int curr = i;
            int index = 0;
            List<Integer>temp = new ArrayList<>();
            while(curr > 0){
                if((curr & 1)==1){
                    temp.add(nums[index]);
                }
                curr = curr>>1;
                index++;
            }
            ans.add(temp);
        }
        return ans;
    }
}
