class Solution {
    public int evalRPN(String[] tokens) {
        int len = tokens.length;
        if(len == 1){
            return Integer.parseInt(tokens[0]);
        }

        Stack<Integer>st = new Stack<>();
        int temp1=0,temp2=0;

        for(int i = 0; i<len; i++){
            String s = tokens[i];
            if(s.equals("+")){
               temp1  = st.pop();
               temp2  = st.pop();
               st.push(temp2 + temp1);
             }else if(s.equals("*")){
               temp1  = st.pop();
               temp2  = st.pop();
               st.push(temp2 * temp1);
             }else if(s.equals("-")){
               temp1  = st.pop();
               temp2  = st.pop();
               st.push(temp2 - temp1);
             }else if(s.equals("/")){
               temp1  = st.pop();
               temp2  = st.pop();
               st.push(temp2 / temp1);
             }else{
                st.push(Integer.parseInt(s));
             }   
             System.out.println("top : "+st.peek());
        }
        return st.pop();
    }
}
