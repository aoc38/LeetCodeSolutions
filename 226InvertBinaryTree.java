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
    public TreeNode invertTree(TreeNode root) {
        //dfs
        TreeNode result = new TreeNode();

        if(root == null){
            return null;
        }
        TreeNode lt = invertTree(root.left);
        TreeNode rt = invertTree(root.right);

        return new TreeNode(root.val, rt,lt);
    }
}
