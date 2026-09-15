class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans = new ArrayList<>();
        int length = nums.length;
        for(int i=0;i<length-2;i++){
            if(i == 0 ||(i>0 && nums[i]>nums[i-1])){
                int target = -nums[i];
                int j = i+1;
                int k = length-1;
                while(j<k){
                    System.out.println("j : "+j+" ,k : "+k);
                    if(nums[j]+nums[k]>target){
                        while(j<k && nums[k]==nums[k-1]){
                            k--;
                        }
                        k--;
                    }else if(nums[j]+nums[k]<target){
                        while(j<k && nums[j]==nums[j+1]){
                            j++;
                        }
                        j++;
                    }else{
                        ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                        while(j<k && nums[j]==nums[j+1]){
                            j++;
                        }
                        j++;
                    }
                }
            }
        } 
        return ans;
    }
}
