class Solution {
    public boolean isPalindrome(String s) {
       int len = s.length();
       if(len==1){
        return true;
       }
       ArrayList<Integer>arr = new ArrayList<Integer>();
       int diff = 'A'-'a';
       char ch ;
       for(int i=0; i<len; i++){
            ch = s.charAt(i);
            if(ch>='A'&& ch<='Z'){
                arr.add(ch-diff);
            }
            if(ch>='a' && ch<='z'){
                arr.add(ch-0);
            }
            if(ch>='0' && ch <='9'){
                arr.add(ch-'0');
            }
       }
            len  = arr.size(); 
       for(int i=0;i<len/2;i++){
            if(arr.get(i)!=arr.get(len-i-1)){
                return false;
            }
       }
       return true; 
    }
}
