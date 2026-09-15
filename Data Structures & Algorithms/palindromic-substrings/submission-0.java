class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        int length = s.length();
        if(length==1) return 1;
        //odd Length
        int start = 0;
        int end = 0;
        for(int i=0; i<length; i++){
            start = i;
              end = i;
            while((start >=0) && (end < length)&&(s.charAt(start) == s.charAt(end))){
                ans++;
                start--;
                end++;
            }
        }
        //even Length
        for(int i=0; i<length; i++){
            start=i;
            end=i+1;
            while(start >=0 && end < length && s.charAt(start)==s.charAt(end)){
                ans++;
                start--;
                end++;
            }
        }
        return ans;
        
    }
}
