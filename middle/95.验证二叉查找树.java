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

/*是没想到啥好办法， 中序遍历一次吧*/
public class Solution {
    /*
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        // write your code here
        Stack<TreeNode> stack = new Stack();
        if(root == null) {
            return true;
        }
        boolean is_first = true;
        int val = root.val;
        while(root != null || stack.size() != 0) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            
            root = stack.pop();
            
            if(is_first) {
                is_first = false;
            } else if (root.val <= val) {
                return false;
            }
            
            val= root.val;
            root = root.right;
        }
        return true;
    }
}
