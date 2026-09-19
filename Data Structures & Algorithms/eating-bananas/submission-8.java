class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans = 0;
        int min =1;
        int max = 0;
        for(int p : piles){
            max = Math.max(max,p);
        }
        while(min<=max){
            int mid = min + (max-min)/2;
            long hours = 0;
            for(int p : piles){
                hours += (p+mid-1)/mid;
                // hours += p%mid>0?1:0;
            }
            if(hours<=h){
                ans = mid;
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return ans;
    }
}
