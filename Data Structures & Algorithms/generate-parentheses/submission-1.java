class Solution {
    int counter = 0;
    public List<String> generateParenthesis(int n) {
        List<String>l = new ArrayList<>();
        l.add("(");
        List<String>pc  = possibleCombinations(l,2*(n-1));
         List<String>ans = new ArrayList<>();
        for(String s : pc){
            if(isValid(s+")")){
                ans.add(s+")");
            }
        }
        return ans;
        
    }

    public List<String> possibleCombinations(List<String>list,int n){
        if(n==0){
            return list;
        }
        List<String>l = new ArrayList<>();
        for(String s:list){
            l.add(s+"(");
            l.add(s+")");
        }
        return possibleCombinations(l,n-1);

       
    }
    public boolean isValid(String st) {
        Stack<Character>s = new Stack<>();
        int len = st.length();
        char c;
        for(int i=0; i<len; i++){
            c = st.charAt(i);
            if(c=='('||c=='{'||c=='['){
                s.push(c);
            }else if(c==')'){
                if(!s.empty() && s.peek()=='('){
                    s.pop();
                }else{s.push(c);}
            }else if(c=='}'){
                if(!s.empty() && s.peek()=='{'){
                    s.pop();
                }else{s.push(c);}
            }else if(c==']'){
                if(!s.empty() && s.peek()=='['){
                    s.pop();
                }else{s.push(c);}
            }
        }
        return s.empty();    
    }

}
