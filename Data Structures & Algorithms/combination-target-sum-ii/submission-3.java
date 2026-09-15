class Solution {
    private Set<List<Integer>>result;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        result = new HashSet<List<Integer>>();
        List<Integer> cur = new ArrayList();
        backtrack(0,candidates,cur,target);
        return new ArrayList<>(result);
    }

    public void backtrack(int start,int[]candidates,List<Integer>curr,int target){
          if(target == 0){
            // System.out.println("curr : "+curr);
            // if(result.size()>0){
            //     boolean match = false;
            //     for(int j=0;j<result.size();j++){
            //     List<Integer>temp = result.get(j);
            //     if(curr.size()==temp.size()){
            //        int len = curr.size();
            //        int counter=0;
            //        for(int i=0;i<len;i++){
            //           if(curr.get(i)==temp.get(i)){
            //                counter++;
            //           }
            //        }
            //        if(counter == len){
            //         match = true;
            //        }
            //        counter=0;
            //     }
                
            //     }
            //     if(!match){
            //         result.add(new ArrayList(curr));
            //     }

            // }else{
            //     result.add(new ArrayList(curr));
            // }

            result.add(new ArrayList(curr));
            return;
          }
          if(target < 0 || start >= candidates.length){
            return;
          }
          curr.add(candidates[start]);
          backtrack(start+1,candidates,curr,target-candidates[start]);
          curr.remove(curr.size()-1);
          backtrack(start+1,candidates,curr,target);
    }
}
