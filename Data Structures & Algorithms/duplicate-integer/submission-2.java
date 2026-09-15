class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer>s = new HashSet<>();
        boolean res = false;
        for(int n : nums){
            if(s.contains(n)){
                res = true;
                break;
            }else{
                s.add(n);
            }
        }
        return res;
    }
}
