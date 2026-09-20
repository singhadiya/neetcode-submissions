class Solution {
    public String minWindow(String s, String t) {
        int sLen = s.length();
        int length = Integer.MAX_VALUE;
        int tLen = t.length();
        int startIndex=0;
        int lastIndex =0;
        if(sLen<tLen) return "";
        int[]sArray = new int[64];
        int[]tArray = new int[64];
        int diff = tLen;
        for(int i=0;i<tLen;i++){
            tArray[t.charAt(i)-'A']++;
        }
        // print(tArray);
        int left=0;
        int right=0;
        while(right<sLen){
            char ch = s.charAt(right);
            if(tArray[ch-'A']>0){
                if(sArray[ch-'A']<tArray[ch-'A']){
                     diff--;
                }
            sArray[ch-'A']++;
            }
                while(left<=right && diff==0){
                    if(right-left+1<length){
                    startIndex=left;
                    lastIndex=right+1;
                    length = right-left+1;
                    }
                    int index = s.charAt(left)-'A';
                    if(sArray[index]>0){
                        if(sArray[index]<=tArray[index]){
                            diff++;
                        }
                        sArray[index]--;
                    }
                    left++;
                }
            // System.out.print("ans : "+ans+" , left : "+left+" , right : "+right+" ::: ");
            // print(sArray);
            right++;
        }
        return lastIndex > 0 ? s.substring(startIndex,lastIndex):"";
    }
    public void print(int[]temp){
        for(int i=0;i<26;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println();
    }
}
