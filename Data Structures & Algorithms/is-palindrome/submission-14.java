class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(left<s.length() && right>=0  && Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
    //     String smallCase = s.toLowerCase();

    //     StringBuffer sb = new StringBuffer();
    //     for(char ch : smallCase.toCharArray()){
    //         if((ch>='0'&&ch<='9')||(ch>='a'&&ch<='z')){
    //             sb.append(ch);
    //         }
    //     }
    //     smallCase = sb.toString();
    //     if(smallCase.length()==0) return true;
    //     for(int i=0;i<=smallCase.length()/2;i++){
    //         if(!(smallCase.charAt(i)==smallCase.charAt(smallCase.length()-1-i))){
    //             return false;
    //         }
    //     }
    return true;
    }

}
