class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int len  = nums.length;
        if(len<3){
            return ans;
        }

        Map<Integer,Integer>m  = new HashMap<>();
        for(int i=0;i<len;i++){
            m.put(nums[i],i);
        }
        
        Set<String>s = new HashSet<>();
        int key = 0;
        for(int i=0; i<len-1;i++){
            for(int j=i+1; j<len; j++){
                key = -1*(nums[i]+nums[j]);
                if(m.containsKey(key)&&m.get(key)>j){   
                    StringBuilder sb = new StringBuilder(); 
                    sb.append(nums[i]).append(",").append(nums[j]).append(",").append(key);
                    s.add(sb.toString());
                }
            }
        }
        
        Iterator<String>it = s.iterator();
        while(it.hasNext()){
            String [] temp = it.next().split(",");
            List<Integer>l = new ArrayList<>();
            l.add(Integer.parseInt(temp[0]));
            l.add(Integer.parseInt(temp[1]));
            l.add(Integer.parseInt(temp[2]));
            ans.add(l);
        }
        return ans;
    }
}
