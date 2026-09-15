class Solution {

    public boolean isValid(String str) {
        if(str.length()%2==1){
            return false;
        }
        Stack<Character>s = new Stack<>();
        Map<Character,Character>closeToopen = new HashMap<>();
        closeToopen.put('}','{');
        closeToopen.put(']','[');
        closeToopen.put(')','(');
        for(Character ch : str.toCharArray()){
            if(closeToopen.containsKey(ch)){
                if(!s.isEmpty() && s.peek()==closeToopen.get(ch)){
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
