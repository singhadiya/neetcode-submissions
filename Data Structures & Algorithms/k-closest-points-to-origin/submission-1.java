class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int r [][] = new int [k][2];
        Map<Integer,List<List<Integer>>> m = new HashMap<>();

        // int[] temp = new int[]{1, 2};
        // List<List<Integer>> res = new ArrayList<>();
        
        // List<Integer> list = new ArrayList<>();
        // for (int num : temp) {
        //     list.add(num); // autoboxing from int to Integer
        // }
        // res.add(list);
        // m.put(temp[0]*temp[0] + temp[1]*temp[1],res);
       

         PriorityQueue<Integer>queue = new PriorityQueue<>();
        for(int[] i : points){
            int num = i[0]*i[0] + i[1]*i[1];
            queue.offer(num);
                List<Integer> list = new ArrayList<>();
                for (int n : i) {
                    list.add(n); 
                }
                 System.out.println(",m.get(num) : "+m);
                 System.out.println("num : "+num);
                if(m.get(num)==null){
                    List<List<Integer>> res = new ArrayList<>();
                    res.add(list);
                    m.put(num,res);
                }else{
                    System.out.println(",m.get(num) : "+m.get(num));
                    m.get(num).add(list);
                    m.put(num,m.get(num));
                }
        }
        int counter = 0;
        while(counter<k){
            int gt = queue.poll();
            if(m.get(gt).size()==1){
                r[counter][0] = m.get(gt).get(0).get(0);
                r[counter][1] = m.get(gt).get(0).get(1);
                m.remove(gt);
            }else{
                 r[counter][0] = m.get(gt).get(0).get(0);
                r[counter][1] = m.get(gt).get(0).get(1);
                m.get(gt).remove(0);
            }
            counter++;
        }
        return r;
    }
}
