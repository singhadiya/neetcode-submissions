class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int s : stones){
            pq.offer(s);
        }
        int stone1 = 0;
        int stone2 = 0;
        while(pq.size()>1){
            stone1 = pq.poll();
            stone2 = pq.poll();
            int remain = Math.abs(stone1-stone2);
            if(remain>0){
                pq.offer(remain);
            }
        }
        System.out.println("size : "+pq.size());
        if(pq.isEmpty()) return 0;
        return pq.peek();       
    }
}
