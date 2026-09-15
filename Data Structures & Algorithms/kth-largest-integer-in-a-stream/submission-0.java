class KthLargest {
    private PriorityQueue<Integer>q ;
    private int target;

    public KthLargest(int k, int[] nums) {
        q = new PriorityQueue<>(Collections.reverseOrder());
        target = k;
        for(int n : nums){
            q.add(n);
        }
        
    }
    
    public int add(int val) {
        int ans = 0;
        q.add(val);
        int [] temp = new int[target];
        for(int i=0; i<target; i++){
             temp[i] = q.poll();
        }
        ans  = temp[target-1];
        for(int i=0; i<target; i++){
             q.add(temp[i]);
        }
        return ans;   
    }
}
