class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if(length<2){
            return length;
        }
        Map<Character,Integer> m = new HashMap<>();
        int maxLen = 1;
        int start=0;
        int end=1;
        int temp = 0;
        m.put(s.charAt(start),start);
        while(end<length && start <length){
            System.out.println("values : "+m.get(s.charAt(end)));
            System.out.println("char : "+s.charAt(end));
            System.out.println("Map : "+m);
            if(m.get(s.charAt(end))!=null){
                temp = m.get(s.charAt(end))+1;
                System.out.println("temp : "+temp);
                System.out.println("m.get(s.charAt(end) : "+m.get(s.charAt(end)));
                int index = m.get(s.charAt(end));
                for(int i=start ; i <= index;i++){
                    m.remove(s.charAt(i));
                }
                m.put(s.charAt(end),end);
                 System.out.println("Map1 : "+m);
                start = temp;
                end++;
            }else{
                maxLen = Math.max(maxLen,end+1-start);
                System.out.println("maxLen : "+maxLen);
                m.put(s.charAt(end),end);
                end++;
            }
        }
        return maxLen;  
    }
}
