class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2) return s.length();
         int ans = 0;
         Set<Character>chars = new HashSet<>();
         int left=0;
         int right = 0;
         while(right<s.length()){
            char ch = s.charAt(right);
            if(chars.contains(ch)){
                while( chars.contains(ch)){
                    chars.remove(s.charAt(left));
                    left++;

                }
            }else{
                chars.add(ch);
                ans = Math.max(ans,right-left+1);
                right++;
            }
            
         }
        return ans;
    }
}
