class Solution {

    public String encode(List<String> strs) {
      StringBuilder s = new StringBuilder();
      for(String str : strs){
        s.append(str.length()).append("#").append(str);
        System.out.println("s : "+s);
      }
      System.out.println("encoded value : "+s);
      return s.toString();
    }

    public List<String> decode(String str) {
        List<String>ans = new ArrayList<>();
        int slen = str.length();
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<slen){
            j = str.indexOf("#",i);
            k = Integer.parseInt(str.substring(i,j));
            ans.add(str.substring(j+1,j+1+k));
            i = j+k+1;
        }
        System.out.println("decodec value : "+ans);
        return ans;
    }
}
