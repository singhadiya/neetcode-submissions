
class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        for(int i : nums){
            num.add(i);
        }
        backtrack(0,num, new ArrayList<>(), result);

        System.out.println(result);
        return result;
    }

    public void backtrack(int start, List<Integer> nums, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));  // Add current subset
        System.out.println("result : "+result);

        for (int i = start; i < nums.size(); i++) {
            System.out.println("path1 : "+path+ ", start : "+i);
            path.add(nums.get(i));                    // Choose
            System.out.println("path2 : "+path+ ", start : "+i);
            backtrack(i + 1, nums, path, result);     // Explore
            path.remove(path.size() - 1);             // Un-choose (backtrack)
            System.out.println("path3 : "+path+ ", start : "+i);
        }
    }
}
