class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        int maxLength=1;
        String ans = s.substring(0,1);
        if(length==1) return ans;
        //odd Length
        int start = 0;
        int end = 0;
        for(int i=0; i<length; i++){
            start = i;
              end = i;
            while((start >=0) && (end < length)&&(s.charAt(start) == s.charAt(end))){
                if(end-start+1>maxLength){
                    maxLength = end-start+1;
                    ans = s.substring(start,end+1);
                }
                start--;
                end++;
            }
        }
        //even Length
        for(int i=0; i<length; i++){
            start=i;
            end=i+1;
            while(start >=0 && end < length && s.charAt(start)==s.charAt(end)){
                if(end-start+1>maxLength){
                    maxLength = end-start+1;
                    ans = s.substring(start,end+1);
                }
                start--;
                end++;
            }
        }
        return ans;
    }

}
