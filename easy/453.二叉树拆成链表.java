/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param root: a TreeNode, the root of the binary tree
     * @return: 
     */
    public void flatten(TreeNode root) {
        // write your code here
        if(root == null) return ;
        TreeNode header = new TreeNode(-1);
        TreeNode tail = header;
        Stack<TreeNode> stack = new Stack();
        stack.add(root);
        while(stack.size() != 0) {
            TreeNode cur = stack.pop();
            tail.right = cur;
            if(cur.right != null) {
                stack.push(cur.right);
            }
            if(cur.left != null) {
                stack.push(cur.left);
                cur.left = null;
            }
            tail = tail.right;
        }
        root = header.right;
    }
}
