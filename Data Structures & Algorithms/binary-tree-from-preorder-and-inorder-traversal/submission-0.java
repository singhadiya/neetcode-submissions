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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = null;
        int length = preorder.length;
        if(length == 0){
            return root;
        }
        System.out.println("Input length > 0");
        return dfs(root,preorder,inorder);  
    }

    public TreeNode dfs(TreeNode root,int [] preorder,int [] inorder){
        int length = preorder.length;
        root = new TreeNode(preorder[0]);
        
        int i=0;
        while(inorder[i] != preorder[0]){
            i++;
        }

        if(i>0){
            int[ ] lin = new int[i];
            int[ ] lpo = new int[i]; 
            System.arraycopy(inorder,0,lin,0,i);
            System.arraycopy(preorder,1,lpo,0,i);
            root.left = dfs(root.left,lpo,lin);
        }

        if(length-i>1){
            int [] rin = new int[length-1-i];
            int [] rpo = new int[length-1-i];
            System.arraycopy(inorder,i+1,rin,0,length-1-i);
            System.arraycopy(preorder,1+i,rpo,0,length-1-i);
            root.right = dfs(root.right,rpo,rin);
        }
        return root;
    }
}
