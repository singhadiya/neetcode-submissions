class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] a = new int[26];
        int s1Len = s1.length();
        int s2Len = s2.length();
        int counter = 0;

        if(s1Len>s2Len){
            return false;
        }
        for(int i=0;i<s1Len;i++){
            a[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2Len-s1Len+1;i++){
             int [] b = new int[26];
             counter = 0;
            for(int j=i;j<i+s1Len;j++){
                b[s2.charAt(j)-'a']++;
                System.out.println("substring : "+s2.substring(i,i+s1Len));
            }
            for(int j=0;j<26;j++){
                // System.out.println("i : "+i+ ", a[i] : "+a[j]+", b[i] : "+b[j]);
                if(a[j]==b[j]){
                    counter++;
                }
            }
            System.out.println("counter : "+counter);
            if(counter==26){
                return true;
            }
        }

        return false;
        
    }
}
