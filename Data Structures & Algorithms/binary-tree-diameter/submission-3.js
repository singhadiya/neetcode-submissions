/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     constructor(val = 0, left = null, right = null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    /**
     * @param {TreeNode} root
     * @return {number}
     */
    max = 0;

    diameterOfBinaryTree(root) {
        if(root == null) return 0;
        const currentDepth = this.maxDepth(root.left) + this.maxDepth(root.right);
        this.max = Math.max(this.max,currentDepth);
        this.diameterOfBinaryTree(root.left);
        this.diameterOfBinaryTree(root.right);
        return this.max;
    }

    maxDepth(root){
       if(root == null) return 0;
       return Math.max(this.maxDepth(root.left),this.maxDepth(root.right))+1;
    }
}
