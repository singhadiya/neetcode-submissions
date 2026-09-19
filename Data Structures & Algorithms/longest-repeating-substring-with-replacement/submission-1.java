class Solution {
    public int characterReplacement(String s, int k) {
        Set<Character>ch = new HashSet<>();
        for(char c : s.toCharArray()){
            ch.add(c);
        }
        int ans =0;
        for(char c :ch){
            int freq = 0;

            int left=0;
            int right=0;
            while(right<s.length()){
                if(s.charAt(right)==c){
                    freq++;
                }
                if(right-left+1-k<=freq){
                    ans = Math.max(ans,right-left+1);
                }
                while(right-left+1-k>freq){
                    if(s.charAt(left)==c){
                        freq--;
                    }
                    left++;
                }
                right++;
            }
        }
        return ans;
    }
}
