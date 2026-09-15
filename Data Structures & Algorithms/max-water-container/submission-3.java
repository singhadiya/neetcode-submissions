class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int i = 0;
        int j = heights.length-1;

        while(i<j){
            System.out.println("i : "+i+" , j : "+j);
            area = Math.max(area,Math.min(heights[i],heights[j])*(j-i));
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return area; 
    }
}
