class Solution {
    private List<List<Integer>>res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        res.add(new ArrayList<>());
        for(int num:nums){
            List<List<Integer>>curr = new ArrayList<>(res);
            int size = res.size();
            System.out.println("size : "+size);
            res.clear();
            for(int i=0;i<size;i++){
                int j=0;
                int s=curr.get(0).size();
                List<Integer>temp = null;
                while(j<=s){
                    temp = new ArrayList(curr.get(i));
                    temp.add(j,num);
                    j=j+1;
                    res.add(temp);
                }
            }
            System.out.println("res2 : "+res);
        }
        return res;
    }  
}
