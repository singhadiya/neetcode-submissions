class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer>m = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        int length = s.length();
        for(int i=0; i<length; i++){
            char c = s.charAt(i);
            if(m.containsKey(c)){
                m.put(c,m.get(c)+1);
            }else{
                m.put(c,1);
            }
            c = t.charAt(i);
            if(m.containsKey(c)){
                m.put(c,m.get(c)-1);
            }else{
                m.put(c,-1);
            }
        }
        for(Map.Entry<Character,Integer> entry : m.entrySet()){
            System.out.println("entry : "+entry);
                if(entry.getValue()!=0){
                    return false;
                }
        }
        return true;

    }
}
