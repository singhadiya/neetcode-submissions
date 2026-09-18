class Solution {
    public boolean isPalindrome(String s) {
        String smallCase = s.toLowerCase();

        StringBuffer sb = new StringBuffer();
        for(char ch : smallCase.toCharArray()){
            if((ch>='0'&&ch<='9')||(ch>='a'&&ch<='z')){
                sb.append(ch);
            }
        }
        smallCase = sb.toString();
        if(smallCase.length()==0) return true;
        for(int i=0;i<=smallCase.length()/2;i++){
            if(!(smallCase.charAt(i)==smallCase.charAt(smallCase.length()-1-i))){
                return false;
            }
        }
        return true;
    }
}
