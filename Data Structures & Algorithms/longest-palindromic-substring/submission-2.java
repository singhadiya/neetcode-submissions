class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        String res = s.substring(0,1);
        int maxLength = 1;

        if(length==1) return res;
        int start = 0;
        int end = 0;
        //for odd length
        for(int i=0; i<length-1; i++){
            start = i;
            end=i;
            while(start>=0 && end<length && s.charAt(start) == s.charAt(end)){
                if(end-start+1>maxLength){
                    maxLength  = end-start+1;
                    res = s.substring(start,end+1);
                }
                start--;
                end++;
            }
            start = i;
            end = i+1;
            while(start>=0 && end<length && s.charAt(start) == s.charAt(end)){
                if(end-start+1>maxLength){
                     maxLength  = end-start+1;
                    res = s.substring(start,end+1);
                }
                start--;
                end++;
            }
        } 
        return res;
    }

}
