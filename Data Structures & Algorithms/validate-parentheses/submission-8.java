class Solution {
    public boolean isValid(String st) {

        int length = st.length();
        Stack<Character>stack = new Stack<>();
        for(int i=0; i<length; i++){
            char c = st.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }else if(c==')'){
                if(!stack.isEmpty()&& stack.peek()=='('){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }else if(c=='}'){
                if(!stack.isEmpty()&& stack.peek()=='{'){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }else if(c==']'){
                if(!stack.isEmpty()&& stack.peek()=='['){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }
}
