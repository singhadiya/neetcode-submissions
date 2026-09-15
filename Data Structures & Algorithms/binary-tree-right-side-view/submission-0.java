/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    List<List<Integer>>temp = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root,0);
        List<Integer>res = new ArrayList<>();
        for(int i =0 ; i<temp.size();i++){
            res.add(temp.get(i).get(temp.get(i).size()-1));
        }
        return res;
    }

    public void dfs(TreeNode root, int depth){
        if(root == null) return;

        if(temp.size()==depth){
            temp.add(new ArrayList<>());
        }
        temp.get(depth).add(root.val);
        dfs(root.left,depth+1);
        dfs(root.right,depth+1);
    }
}
