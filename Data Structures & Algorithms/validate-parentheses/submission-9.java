class Solution {

    public boolean isValid(String str) {
        Stack<Character>s = new Stack<>();
        for(Character ch : str.toCharArray()){
            if(ch=='}'){
                if(!s.isEmpty() && s.peek()=='{'){
                    s.pop();
                }else{
                    s.push(ch);
                }
            }else if(ch==']'){
                if(!s.isEmpty()&&s.peek()=='['){
                    s.pop();
                }else{
                    s.push(ch);
                }
            }else if(ch==')'){
                if(!s.isEmpty()&&s.peek()=='('){
                    s.pop();
                }else{
                    s.push(ch);
                }
            }else{
                s.push(ch);
            }
        }
        return s.isEmpty();
        
    }
}
