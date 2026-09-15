class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();

        if(s1Length>s2Length) return false;
        
        for(int i=0; i<=s2Length-s1Length;i++){
            String test = s2.substring(i,i+s1Length);
            if(isPermutation(s1,test)){
                return true;
            }
        }
        return false;
    }
    public boolean isPermutation(String s,String d){
        int[]sa = new int[26];
        int[]da = new int[26];

        int length = s.length();
        for(int i=0;i<length;i++){
            sa[s.charAt(i)-'a']++;
            da[d.charAt(i)-'a']++;
        }
        for(int i=0; i<26;i++){
            if(sa[i]!=da[i]){
                return false;
            }
        }
        return true;
    }
}
