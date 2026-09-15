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
     * @return {boolean}
     */

    isBalanced(root) {
        if(root === null ) return true;
        if(this.isBalanced(root.left) === false) return false;
        if(this.isBalanced(root.right)=== false) return false;

        if(Math.abs(this.maxDepth(root.left)-this.maxDepth(root.right))>1){
            return false;
        } 
        return true;
    }

    maxDepth(root){
        if(root === null) return 0;

        return Math.max(this.maxDepth(root.left),this.maxDepth(root.right))+1;

    }
}
