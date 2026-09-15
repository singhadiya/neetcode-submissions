class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if(length < 2) return length;
        int max = 1;
        int current = 1;
        Set<Character>unique = new HashSet<>();
        int left=0;
        unique.add(s.charAt(0));
        int right =1;
        while(right < length){
            while(right < length && !unique.contains(s.charAt(right))){
                unique.add(s.charAt(right));
                max = Math.max(max,right-left+1);
                right++;
            }
            while(right<length && unique.contains(s.charAt(right))){
                unique.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
