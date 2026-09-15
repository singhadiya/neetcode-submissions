class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights) {
        let max = 0;
        let start = 0;
        let end = heights.length - 1;
        while(start < end){
            max = Math.max(max,Math.min(heights[start],heights[end])*(end-start));
            if(heights[start]<heights[end]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}
