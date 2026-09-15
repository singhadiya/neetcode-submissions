class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>q = new PriorityQueue<>(Collections.reverseOrder());
        for(int s : stones){
            q.offer(s);
        }
        int ans = 0;
        int x=0,y=0;
        while(!q.isEmpty()){
            x = q.poll();
            if(q.isEmpty()){
                ans =  x;
                break;
            }
            y = q.poll();
            if(x != y) {
                q.offer(Math.abs(x-y));
            }
        }
        return ans;
    }
}
