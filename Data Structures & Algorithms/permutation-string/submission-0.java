class Solution {
    public boolean checkInclusion(String s1, String s2) {
        boolean result = false;
        int s1_length = s1.length();
        int s2_length = s2.length();

        if(s1_length > s2_length) return false;

        int []pattern = getData(s1);

        for(int i=0; i<s2_length-s1_length+1; i++){
            if(permutationChecker(pattern,getData(s2.substring(i,i+s1_length)))){
                return true;
            }     
        }
        return result;    
    }
    public int[] getData(String s){
        int length = s.length();
        int []ans = new int[26];
        for(int i=0;i<length;i++){
            ans[s.charAt(i)-'a']++;
        }
        return ans;
    }
    public boolean permutationChecker(int[]a,int[]b){
        int len = a.length;
        boolean result  = true;
        for(int i=0; i<len; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return result;
    }

}
