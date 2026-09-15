class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        Map<Character,Integer>m = new HashMap<>();
        int sum = 0;
        int total = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            m.put(c,m.getOrDefault(c,0)+1);
        }
        Set<Character>set = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            set.add(c);
            total++;
            m.put(c,m.get(c)-1);
            Iterator it = set.iterator();
            sum = 0;
            while(it.hasNext()){
                sum +=m.get(it.next());
            }
            if(sum == 0){
            ans.add(total);
            set.clear();
            total = 0;
            }
        }    
        return ans;
    }
}
