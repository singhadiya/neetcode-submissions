class Solution {
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
