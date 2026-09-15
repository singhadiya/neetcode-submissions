class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans  = new ArrayList<List<String>>();
        HashMap<String,List<String>>map = new HashMap();
        for(String str : strs){
            String temp = sortString(str);
            if(map.containsKey(temp)){
                List<String>l = map.get(temp);
                l.add(str);
                map.put(temp,l);
            }
            else{
                 List<String>l = new ArrayList();
                l.add(str);
                map.put(temp,l);
            }
        }
        System.out.println("String : "+map);
        for(List<String>s : map.values()){
            ans.add(s);
        }
        return ans;
    }

    public String sortString(String str){
        char [] c = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
