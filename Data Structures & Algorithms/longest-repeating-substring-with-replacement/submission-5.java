class Solution {
    public int characterReplacement(String s, int k) {

        int ans = 0;
        // Map<Character,Integer>freq = new HashMap<>();
        int[]freq = new int[26];
        int left = 0;
        int right = 0;
        int maxFreq = 0;
        while(right<s.length()){
            char ch = s.charAt(right);
            // freq.put(ch,freq.getOrDefault(ch,0)+1);
            freq[ch-'A']++;
            maxFreq = Math.max(maxFreq,freq[ch-'A']);
            if(right-left+1-k<=maxFreq){
                ans = Math.max(ans,right-left+1);
            }
            if(right-left+1-k>maxFreq){
                // freq.put(s.charAt(left),freq.get(s.charAt(left))-1);
                freq[s.charAt(left)-'A']--;
                left++;
            }
            right++;
        }
        return ans;


        // Set<Character>ch = new HashSet<>();
        // for(char c : s.toCharArray()){
        //     ch.add(c);
        // }
        // int ans =0;
        // for(char c :ch){
        //     int freq = 0;

        //     int left=0;
        //     int right=0;
        //     while(right<s.length()){
        //         if(s.charAt(right)==c){
        //             freq++;
        //         }
        //         if(right-left+1-k<=freq){
        //             ans = Math.max(ans,right-left+1);
        //         }
        //         while(right-left+1-k>freq){
        //             if(s.charAt(left)==c){
        //                 freq--;
        //             }
        //             left++;
        //         }
        //         right++;
        //     }
        // }
        // return ans;
    }
}
