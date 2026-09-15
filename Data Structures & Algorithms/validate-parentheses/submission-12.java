class Solution {

    public boolean isValid(String str) {
        Stack<Character>s = new Stack<>();
        for(Character ch : str.toCharArray()){
            if(ch=='}'){
                if(!s.isEmpty() && s.peek()=='{'){
                    s.pop();
                }else{
                   return false;
                }
            }else if(ch==']'){
                if(!s.isEmpty()&&s.peek()=='['){
                    s.pop();
                }else{
                    return false;
                }
            }else if(ch==')'){
                if(!s.isEmpty()&&s.peek()=='('){
                    s.pop();
                }else{
                    return false;
                }
            }else{
                s.push(ch);
            }
        }
        return s.isEmpty();
        
    }
}
