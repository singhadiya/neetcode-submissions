class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer>m = new HashSet<Integer>();
        for(int n : nums){
           if(m.contains(n)){
               return true;
           }else{
            m.add(n);
           }
        }
        return false;
    }
}
