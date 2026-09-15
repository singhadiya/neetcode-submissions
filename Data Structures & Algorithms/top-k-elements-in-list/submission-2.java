class Solution {
    public int[] topKFrequent(int[] nums, int K) {
        HashMap<Integer,Integer>m = new HashMap<Integer,Integer>();
        for(int num : nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        int len = nums.length+1;
        List<Integer>[] l = new List[len];
        for (int i = 0; i < len; i++) {
            l[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + "/" + entry.getValue());
            l[entry.getValue()].add(entry.getKey());
        } 
        for(List<Integer> i : l){
            System.out.println("values : "+i);
        }
        int counter = 0;
        int []ans = new int [K];
        for(int i=len-1;i>=0;i--){
            for(int n : l[i]){
                ans[counter++] = n;
                if(counter==K){
                    return ans;
                }
            }
        }    
        return ans;  
    }
    
}
