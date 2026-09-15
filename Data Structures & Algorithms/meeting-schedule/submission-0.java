/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort((a,b)-> a.end -b.end);
        int len = intervals.size();
        if(len<2) return true;
        for(int i=len-2;i>=0;i--){
                 System.out.println("intervals.get(i+1).start : "+intervals.get(i+1).start);
                 System.out.println("intervals.get(i).end : "+intervals.get(i).end);
               if(intervals.get(i+1).start<intervals.get(i).end){
                return false;
               }
        }
        return true;
    }
}
