class Solution {
    public int longestConsecutive(int[] nums) {
        int longestSequence = 0;
        Set<Integer>s = new HashSet<>();
        for(int n : nums){
             s.add(n);
        }
        int len = nums.length;
        for(int i=0;i<len;i++){
            int counter=1;
            int temp = nums[i];
            while(s.contains(temp+1)){
                counter++;
                temp++;
            }
            longestSequence = Math.max(longestSequence,counter);
        }
        return longestSequence;
    }
}
