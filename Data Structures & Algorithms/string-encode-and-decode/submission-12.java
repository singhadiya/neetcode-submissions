class Solution {

    public String encode(List<String> strs) {
        String ans = "";
        for(String str : strs){
            ans += Integer.toString(str.length())+"#"+str;
        }
        return ans;
    }

    public List<String> decode(String str) {
        List<String>ans = new ArrayList<>();
        int length=str.length();
        int i=0;
        while(i<length){
            int tokenIndex = str.indexOf("#",i);
            int tokenSize = Integer.parseInt(str.substring(i,tokenIndex));
            String temp = str.substring(tokenIndex+1,tokenIndex+1+tokenSize);
            i = tokenIndex+1+tokenSize;
            ans.add(temp);
 
        }
        return ans;

    }
}
