class Solution {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        if(len==0){
            return len;
        }
        Set<Integer>s = new HashSet<Integer>();
        for(int i : nums){
            s.add(i);
        }
        int max =1;
        int current = 1;
        int i=0;
        int temp;
        boolean status = true;
        while(i<len){
            temp = nums[i];
            while(status){
                if(s.contains(temp+1)){
                    temp = temp+1;
                    current++;
                    if(current>max){
                        max = current;
                    }
                }else{
                    status = false;
                    current = 1;
                }
            }
            status = true;
            i++;

        }
        return max;
        
    }
}
