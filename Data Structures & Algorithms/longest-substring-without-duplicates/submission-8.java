class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2) return s.length();
         int ans = 0;
         Map<Character,Integer>chars = new HashMap<>();
         int left=0;
         int right = 0;
         while(right<s.length()){
            char ch = s.charAt(right);
            if(chars.containsKey(ch)){
                while( chars.containsKey(ch)){
                    chars.remove(s.charAt(left));
                    left++;

                }
            }else{
                chars.put(ch,right);
                ans = Math.max(ans,right-left+1);
                right++;
            }
            
         }
        return ans;
    }
}
