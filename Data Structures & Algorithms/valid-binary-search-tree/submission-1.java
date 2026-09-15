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
    private  List<Integer>list = new ArrayList<Integer>();
    public boolean isValidBST(TreeNode root) {
      inorderTraversal(root);
        int len = list.size();
        if(len <= 1){
            return true;
        }
        int min = list.get(0);
        for(int i=1 ; i<len;i++){
              if(list.get(i)<=list.get(i-1)){
                return false;
              }
        }
        return true;
    }

    public void inorderTraversal(TreeNode root) {
        if(root == null) return ;

        inorderTraversal(root.left);
        System.out.println("root.val : "+ root.val);
        list.add(root.val);
        inorderTraversal(root.right);

    }
}
