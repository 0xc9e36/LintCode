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
 
 
// 没啥好说的，思路和72一样
public class Solution {
    /**
     *@param preorder : A list of integers that preorder traversal of a tree
     *@param inorder : A list of integers that inorder traversal of a tree
     *@return : Root of a tree
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // write your code here
        if(preorder.length != inorder.length) {
            return null;
        }
        return dfs(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }
    
    public TreeNode dfs(int[] preorder, int pre_s, int pre_len, int[] inorder, int in_s, int in_len) {
        if(in_len < 1) {
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[pre_s]);
        boolean is_found = false;
        int len = 0;
        for(; len < in_len; len++) {
            if(root.val == inorder[in_s + len]) {
                is_found = true;
                break;
            }
        }
        if(!is_found) {
            return root;
        }
        root.left = dfs(preorder, pre_s + 1, len, inorder, in_s, len);
        root.right = dfs(preorder, pre_s + len + 1, pre_len - 1 - len, inorder, in_s + len + 1, in_len - len - 1);
        return root;
    }
}
