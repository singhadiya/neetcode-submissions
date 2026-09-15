class Solution {
    public boolean isValid(String str) {
        char [] c_array = str.toCharArray();
        Stack<Character>s = new Stack<>();

        for(char c : c_array){
            if(c == '}'){
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='{'){
                    s.pop();
                }else{
                    s.push(c);
                }    
            }else if(c == ']'){
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='['){
                    s.pop();
                }else{
                    s.push(c);
                }    
            }else if(c == ')'){
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek()=='('){
                    s.pop();
                }else{
                    s.push(c);
                }    
            }else{
                s.push(c);
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
}
