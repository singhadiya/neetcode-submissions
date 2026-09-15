class Solution {
        private List<String>ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        dfs(0,digits,"");
        return ans;
    }
    public void dfs(int index,String digits,String data){
        if(index == digits.length()){
            if(index>0){
                ans.add(data);
                }
            return;
        }
           String letters = keypadMapper(digits.charAt(index));
            for(int i=0; i<letters.length();i++){
                dfs(index+1,digits,data+letters.charAt(i));
            }
        }

    public String keypadMapper(char c){
        switch(c){
            case '2':
             return "abc";
            case '3':
             return "def";
            case '4':
             return "ghi";
            case '5':
             return "jkl";
            case '6':
             return "mno";
            case '7':
             return "pqrs";
            case '8':
             return "tuv";
            case '9':
             return "wxyz";
        }
        return null;
    }
}
