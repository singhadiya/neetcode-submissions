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
        int counter = -1;
        Queue<TreeNode> q = new LinkedList<>();
        root.val = counter;
        q.add(root);
        TreeNode temp;
        while(!q.isEmpty()){
            temp = q.poll();
            if(temp.left != null){
                temp.left.val = temp.val-1;
                counter = temp.val-1;
                q.add(temp.left);
            }
            if(temp.right != null){
                temp.right.val = temp.val-1;
                counter = temp.val-1;
                q.add(temp.right);
            }
            System.out.println(counter);
        }

        return -1*counter;
    }
}
