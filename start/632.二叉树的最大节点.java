public class Solution {
    /**
     * @param root the root of binary tree
     * @return the max ndoe
     */
    public TreeNode maxNode(TreeNode root) {
        // Write your code here
        if(root == null) return null;
        TreeNode left = maxNode(root.left);
        TreeNode right = maxNode(root.right);
        TreeNode max = root;
        if(left != null && left.val > max.val) {
            max = left;
        }
        if(right != null && right.val > max.val) {
            max = right;
        }        
        return max;
    }
    
}
