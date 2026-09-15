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
    private int ans = 0;
    public int maxPathSum(TreeNode root) {
        ans = root.val;
        dfs(root);
        return ans;
    }

   public int  dfs(TreeNode root){
    if(root == null) return 0;
    System.out.println("val : "+root.val);
    int left = dfs(root.left);
    int right = dfs(root.right);
    ans = Math.max(ans,root.val+left+right);
    ans = Math.max(ans,root.val+left);
    ans = Math.max(ans,root.val+right);
    ans = Math.max(ans,root.val);
    int temp =  Math.max(left,right);
    return Math.max(temp,0)+root.val;
   }
}
