class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String s : strs){
            res.append(Integer.toString(s.length())).append('#').append(s);
        }
        System.out.println("res : "+res);
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String>res = new ArrayList<>();
        int i=0;
        int len = str.length();
        while(i<len){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int num = Integer.parseInt(str.substring(i,j));
            i = 1+j;

            res.add(str.substring(i,i+num));
            i = i+num;
        }
        return res;
    }
}
