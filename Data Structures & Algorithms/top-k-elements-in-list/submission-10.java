@SuppressWarnings("unchecked")
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>freq = new HashMap<>();

        for(int num : nums){
            freq.put(num,freq.getOrDefault(num, 0) + 1);
        }
       List<List<Integer>> data = new ArrayList<>();
for (int i = 0; i < nums.length; i++) {
    data.add(new ArrayList<>());
}

        for(Map.Entry<Integer,Integer>entry:freq.entrySet()){
            // List<Integer>temp = data[entry.getValue()-1];
            // temp.add(entry.getKey());
            data.get(entry.getValue()-1).add(entry.getKey());
        }
        int []ans = new int[k];
        int count = 0;
        int i= data.size()-1;
        while(count<k){
            List<Integer>temp = data.get(i);
            if(temp.size()>0){
                for(int t : temp){
                    ans[count] = t;
                    count++;
                }
            }
            i--;
        } 
        return ans; 
    }
}
