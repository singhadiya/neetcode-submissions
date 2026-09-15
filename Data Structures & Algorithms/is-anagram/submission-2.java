class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Byte>letters = new HashMap<Character,Byte>();
        char [] c = s.toCharArray();
        for(char ch : c){
            if(letters.containsKey(ch)){
                letters.put(ch,(byte)(letters.get(ch)+1));
            }else{
                letters.put(ch,(byte)1);
            }
        }

        c  = t.toCharArray();
        System.out.println("1 : "+letters);
        for(char ch : c){
            if(letters.containsKey(ch)&&letters.get(ch)>1){
                letters.put(ch,(byte)(letters.get(ch)-1));
            }else{
                letters.remove(ch);
            }
        }
        System.out.println("2 : "+letters);
        if(letters.size()>0){
            return false;
        }
        return true;
    }
}
