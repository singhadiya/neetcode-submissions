class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        int length = nums.length;
        if(length<=k){
            for(int i=0;i<length;i++){
                pq.add(nums[i]);
            }
            return new int[]{pq.poll()};
        }
        int[]ans = new int[length-k+1];
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        int left=0;
        int right=k;
        ans[0]=pq.peek();
        while(right<length){
            pq.remove(nums[left]);
            pq.add(nums[right]);
            left++;
            right++;
            ans[left]=pq.peek();
        }
        return ans;
    }
}
