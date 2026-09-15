class Solution {
    public boolean isAnagram(String s, String t) {
        int[] data = new int[26];
        boolean res = true;
        char[] sArray = s.toCharArray();
        for(char c : sArray){
            data[c-'a']++;
        }
        char [] tArray = t.toCharArray();
        for(char c : tArray){
            data[c-'a']--;
        }
        
        for(int i=0;i<26;i++){
           if(data[i]!=0){
            res = false;
            break;
           }
        }
        return res;
    }
}
