class Solution {
    /**
     * @param {number[]} piles
     * @param {number} h
     * @return {number}
     */
    minEatingSpeed(piles, h) {

        let start = 0;
        let end = piles[0];
        let mid = 0
        let ans = 0
        for(let pile of piles){
            end = Math.max(end,pile);
        }
        mid = end;
        while(start<=end){
            console.log(mid);
            let timetaken = 0; 
            for(let p of piles){
                timetaken += Math.ceil(p/mid);
            }

            if(timetaken > h){
                start = mid+1;
            }else if(timetaken <= h){
                if(ans == mid){
                    return mid;
                }
                ans = mid;
                end = mid-1;
            }else{
                return mid;
            }
            mid = Math.trunc((start+end)/2);
        }
        return ans;
    }
}
