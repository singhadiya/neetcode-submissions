class Solution {
    public boolean isPalindrome(String s) {

    List<Character>list = new ArrayList<Character>();
    int sLength = s.length();
    if(sLength<=1) return true;
    for(int i=0; i<sLength; i++){
        char c = s.charAt(i);
        if((c-'a'>=0 && c -'z' <= 0)||(c-'A'>=0 && c-'Z'<=0)||(c-'0'>=0 && c-'9' <= 0)){
            if(c-'A'>=0 && c-'Z'<=0){
                c = Character.toLowerCase(c);
            }
            list.add(c);
        }
    }  
    System.out.println("list : "+list);
    int Length = list.size();
    if(Length <= 1) return true;
    for(int i=0; i<=Length/2; i++){
        System.out.println("start : "+list.get(i));
        System.out.println("end : "+list.get(Length-1-i));
        if(list.get(i)!=list.get(Length-1-i)){
            return false;
        }
    }
    return true;
    }
}
