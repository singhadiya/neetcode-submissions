class Solution {
    private List<String>ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(n*2,0,"");
        System.out.println(validParenthesis("()"));
        return ans;
    }
    public void dfs(int n,int current,String s){
        if(n == current){
            if(validParenthesis(s)){
                 ans.add(s);
            }
            return;
        }
        dfs(n,current+1,s+"(");
        dfs(n,current+1,s+")");
    }
    public boolean validParenthesis(String st){
        Stack<Character>s = new Stack<>();
        for(int i=0;i<st.length();i++){
            char c = st.charAt(i);
            if(c == '('){
                s.push(c);
            }else if(c==')' && !s.isEmpty() && s.peek()=='('){
                s.pop();
            }else{
                s.push(c);
            }
        }
        return s.isEmpty();
    }

}
