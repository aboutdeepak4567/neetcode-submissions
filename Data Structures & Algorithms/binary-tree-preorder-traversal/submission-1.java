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
    List<Integer> res;
    private void preOrder(TreeNode node){

        if(node == null){
            return;
        }
        res.add(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        res = new ArrayList<>();
        preOrder(root);
        return res;
        
    }
}