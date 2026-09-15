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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String s = "";
        if(root == null) return null;
        Queue<TreeNode>q = new LinkedList<>();
        q.offer(root);
        s += "#"+root.val;
        while(!q.isEmpty()){
            TreeNode d = q.poll();
            if(d.left != null){
                 s += "#"+d.left.val;
                 q.offer(d.left);
            }else{
                s += "#"+1001;
            }
            if(d.right != null){
                 s += "#"+d.right.val;
                 q.offer(d.right);
            }else{
                s += "#"+1001;
            }
        }
        System.out.println("s : "+s);
        return s;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == null) return null;
        String []arr = data.split("#");
        for(String a : arr){
            System.out.print( " "+a);
        }
        System.out.println();
        int length = arr.length;
        if(length == 0) return null;

        TreeNode root = new TreeNode(Integer.parseInt(arr[1]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int index= 2;
        while(index<length && !q.isEmpty()){
            TreeNode node = q.poll();
            if(arr[index].equals("1001")){
                node.left = null;
            }else{
                node.left = new TreeNode(Integer.parseInt(arr[index]));
                q.offer(node.left);
            }
            index++;
            if(arr[index].equals("1001")){
                node.right = null;
            }else{
                node.right = new TreeNode(Integer.parseInt(arr[index]));
                q.offer(node.right);
            }
            index++;
        }
        return root;
    }
}
