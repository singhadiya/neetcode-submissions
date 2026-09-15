class Solution {
    public int search(int[] n, int target) {
        int len = n.length;
        int start = 0,end = len-1,mid=start;
        while(start<=end){
            mid = (start+end)/2;
            System.out.println("start : "+start+" , end : "+end);
            System.out.println("mid : "+mid);
            if(n[mid]>target){
                end = mid-1;
            }else if(n[mid]<target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
