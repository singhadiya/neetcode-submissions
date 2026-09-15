class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        Set<String>s = new HashSet<>();
        Arrays.sort(nums);
        for(int n : nums){
            System.out.println("Sorted data : "+n);
        }

        int len = nums.length;
        for(int i=0; i<len; i++){
            System.out.println("0");
            int target = -1*nums[i];
            int left = i+1; 
            int right = len-1;
            while(left<right){
                System.out.println("left : "+left+" , right : "+right);
                if((nums[left]+nums[right])>target){
                    System.out.println("1");
                    right--;
                }else if((nums[left] + nums[right])<target){
                    System.out.println("2");
                    left++;
                }else{
                    System.out.println("3");
                    if(i!=left && i!=right){

                        StringBuilder sb = new StringBuilder();
                        sb.append(nums[i]).append(nums[left]).append(nums[right]);
                        String tmp = sb.toString();
                        if(!s.contains(tmp)){
                            s.add(tmp);
                            List<Integer>triplet = new ArrayList<>();
                            triplet.add(nums[i]);
                            triplet.add(nums[left]);
                            triplet.add(nums[right]);
                            System.out.println("triplet : "+triplet);
                            ans.add(triplet);
                        }
                    }
                    left++;
                }
            }
        }
        return ans;
    }
}
