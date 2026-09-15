class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if(length < 2) return length;
        int max = 1;
        int current = 1;
        Map<Character,Integer>unique = new HashMap<>();
        int left=0;
        unique.put(s.charAt(0),0);
        int right =1;
        while(right < length){
            while(right < length && !unique.containsKey(s.charAt(right))){
                unique.put(s.charAt(right),right);
                max = Math.max(max,right-left+1);
                right++;
            }
            while(right<length && unique.containsKey(s.charAt(right))){
                unique.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
