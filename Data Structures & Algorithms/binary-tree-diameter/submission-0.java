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
    private int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        max = Math.max (max,diameterOfBinaryTree(root.right));
        max = Math.max (max,diameterOfBinaryTree(root.left));

        return Math.max(max , (Length(root.left)+Length(root.right)));
          
        
    }

    public int Length(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max(Length(root.left),Length(root.right));
    }
}
