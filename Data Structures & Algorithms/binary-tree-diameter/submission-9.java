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
    private int res = 0;
    private int height(TreeNode node){
        if(node == null){
            return 0;
        }
        return 1 + Math.max(height(node.left),height(node.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int diaMeter = leftHeight + rightHeight;
        res = Math.max(res,diaMeter);
        res = Math.max(res, diameterOfBinaryTree(root.left));
        res = Math.max(res, diameterOfBinaryTree(root.right));
        return res;
        
        

        
    }
}
