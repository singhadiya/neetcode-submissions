class Solution {
    public int maxArea(int[] heights) {
        int max = 0,current = 0;
        int len = heights.length;
        int i=0, j=len-1;
        int min = 1000;
        while(i!=j){
            current = Math.min(heights[i],heights[j])*(j-i);
            max = Math.max(max,current);
            if(heights[i]>heights[j]){
                j--;
            }else{
                i++;
            }
        } 
        return max;
    }
}
