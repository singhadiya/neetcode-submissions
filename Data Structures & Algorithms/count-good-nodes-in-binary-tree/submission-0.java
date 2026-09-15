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
    private int counter = 0;
    public int goodNodes(TreeNode root) {
        if(root == null) return counter;
        counter++;
        nodesGreaterThanMax(root.left,root.val);
        nodesGreaterThanMax(root.right,root.val);
        return counter;
    }

    public void nodesGreaterThanMax(TreeNode root , int max){
      if(root == null) return ;
      if(root.val >= max){
        counter++;
        max = root.val;
      }
      nodesGreaterThanMax(root.left,max);
      nodesGreaterThanMax(root.right,max);
    }  
}
