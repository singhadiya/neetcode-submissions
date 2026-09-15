class Solution {
     List<List<String>>ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        dfs(0,s,new ArrayList<>());
        return ans;
    }
    
    public void dfs(int index,String s,List<String>data){
        if(index == s.length()){
            ans.add(data);
            return;
        }
        int length = s.length();
        int start =0;
        int end=0;
        //odd palindrome
        for(int i=index;i<length;i++){
            start = i;
            end = i;
            while(start>=index&&end<length && s.charAt(start)==s.charAt(end)){
                if(start==index){
                    data.add(s.substring(start,end+1));
                    dfs(end+1,s,new ArrayList<>(data));
                    data.remove(data.size()-1);
                }
                start--;
                end++;
            }
        }
        //even palindrome
        for(int i=index;i<length;i++){
            start = i;
            end = i+1;
            while(start>=index&&end<length && s.charAt(start)==s.charAt(end)){
                if(start==index){
                    data.add(s.substring(start,end+1));
                    dfs(end+1,s,new ArrayList<>(data));
                    data.remove(data.size()-1);
                }
                start--;
                end++;
            }
        }
    }
}
