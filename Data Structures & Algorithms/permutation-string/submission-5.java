class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Len = s1.length();
        int s2Len = s2.length();
        if(s1Len>s2Len){
            return false;
        }
        int[] temp = new int[26];
        for(int i=0;i<s1Len;i++){
            temp[s1.charAt(i)-'a']++;
            temp[s2.charAt(i)-'a']--;
        }
        if(compare(temp)) return true;
        if(s1Len==s2Len){
            return false;
        }
        int left = 0;
        int right = s1Len;
        while(right<s2Len){
            temp[s2.charAt(left)-'a']++;
            temp[s2.charAt(right)-'a']--;
            if(compare(temp)) return true;
            left++;
            right++;
        }
        return false;
    }
    public boolean compare(int[]s1){
        for(int i=0;i<26;i++){
            if(s1[i]!=0){
                return false;
            }
        }
        return true;
    }
    public void print(int[]temp){
        for(int t : temp){
            System.out.print(t+ " ");
        }
        System.out.println();
    }
}
