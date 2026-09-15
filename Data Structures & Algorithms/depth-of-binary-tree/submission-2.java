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
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int counter = 1;
        Queue<TreeNode>q = new LinkedList<>();
        root.val = counter;
        q.offer(root);
        
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr.left!=null){
                curr.left.val = curr.val +1;
                counter = curr.left.val;
                q.offer(curr.left);
            }
            if(curr.right!=null){
                curr.right.val = curr.val +1;
                counter = curr.right.val;
                q.offer(curr.right);
            }
        }
        return counter;
    }
}