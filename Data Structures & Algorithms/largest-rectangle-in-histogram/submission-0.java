class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        if(len ==1){
            return heights[0];
        }
        Stack<int[]>s = new Stack<>();
        s.add(new int[]{0,heights[0]});
        
        int i=0;
        int index = 0;
        int max=0;
        while(i<len){
           if(s.peek()[1]<=heights[i]){
                s.add(new int[]{i,heights[i]});
           } 
           else{
               while(!s.isEmpty() && s.peek()[1]>heights[i]){
                  max = Math.max(max,(i-s.peek()[0])*s.peek()[1]);
                  index = s.pop()[0];
               }
               s.add(new int[]{index,heights[i]});
           }
           i++;
        }
        while(!s.isEmpty()){
            max = Math.max(max,(len-s.peek()[0])*s.peek()[1]);
            s.pop();
        }
        return max;
    }
}
