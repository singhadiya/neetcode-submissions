class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i : piles){
            max = Math.max(max,i);
        }
        int start=1,end=max,mid=0;
        int ans=0;
        while(start<=end){
            mid=(end+start)/2;
            System.out.println("mid : "+mid);
            if(timeTaken(piles,mid)>h){
                start = mid+1;
            }else if(timeTaken(piles,mid)<=h){
                end = mid-1;
                ans = mid;
            }
        }
        return ans;
    }

    public int timeTaken(int[] piles,int rate){
        int sum = 0;
        for(int pile : piles){
            sum += pile/rate ;
            if(pile%rate>0){
                sum++;
            }
        }
        System.out.println("timeTaken : "+sum);
        return sum;
    }
}
