class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();
        for(String str : strs){
            sb.append(Integer.toString(str.length())).append("#").append(str);
        }
        return sb.toString();
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
