class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Boolean>m = new HashMap<Integer,Boolean>();
        System.out.println("m : "+m);
        for(int n : nums){
           if(m.containsKey(n)){
               return true;
           }else{
            m.put(n,true);
           }
        }
        return false;
    }
}
