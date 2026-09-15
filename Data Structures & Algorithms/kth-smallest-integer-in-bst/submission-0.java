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
    private boolean status = false;
    private int counter = 0;
    private int target = 0;
    private int num = 0;

    public int kthSmallest(TreeNode root, int k) {
        target = k;

        inorderTraversal(root);
        return num;
    }

    public void inorderTraversal(TreeNode root){
        if(status == true){
            return ;
        }
        if(root == null) return;
        inorderTraversal(root.left);
        counter++;

        if(counter == target){
            System.out.println( "counter  : "+ counter);
            System.out.println( "target  : "+ target);
            System.out.println( "root.val  : "+ root.val);
             num = root.val;
            status =  true;
        }
         
        inorderTraversal(root.right);


    }
}
