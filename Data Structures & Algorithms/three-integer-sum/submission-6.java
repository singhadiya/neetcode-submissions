class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            int target = -nums[i];
            while(left<right){
                if(nums[left]+nums[right]==target){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left]==nums[left+1]) left++;
                    while(left<right && nums[right]==nums[right-1]) right--;
                    left++;
                    right--;
                }
                if(left<right && nums[left]+nums[right]>target){
                    right--;
                }else if(left<right && nums[left]+nums[right]<target){
                    left++;
                }
            }
        }
        // Set<Integer>s = new HashSet<>();
        // for(int i=0;i<nums.length-2;i++){
        //     int target = -1*nums[i];
        //     s.clear();
        //     for(int j=i+1;j<nums.length;j++){
        //         if(s.contains(target-nums[j])){
        //             ans.add(Arrays.asList(nums[i],target-nums[j],nums[j]));
        //         }else{
        //             s.add(nums[j]);
        //         }
        //     }
        // }
        // Set<String>set = new HashSet<>();
        // for(int j=ans.size()-1;j>=0;j--){
        //     Collections.sort(ans.get(j));
        //    String data = ans.get(j).toString();
        //    if(set.contains(data)){
        //     ans.remove(j);
        //    }else{
        //     set.add(data);
        //    }
        // }
        return ans;
    }
}
