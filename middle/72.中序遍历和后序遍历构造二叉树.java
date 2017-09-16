public class Solution {
    /*
     * @param inorder: A list of integers that inorder traversal of a tree
     * @param postorder: A list of integers that postorder traversal of a tree
     * @return: Root of a tree
     */
     
     
     /*
      * 思路想到了，可惜代码没写出来。
      * 举例   
      *        8
      *       / \
      *      1   3
      *     /\    \
      *    8  9    7
      *   中序遍历：8 1 9 2 3 7
      *   后续遍历：8 9 1 7 3 2
      *   得出 2 位根节点， 然后再中序遍历里面找出 2 的位置 index。 在 index 前都为左子树， 在 index 后都为右子树
      *
      *
      */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length != postorder.length) {
            return null;
        }
        // write your code here
        return dfs(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }
    
    public TreeNode dfs(int[] inorder, int in_s, int in_len, int[] postorder, int po_s, int po_len) {
        if(in_len < 1) {
            return null;
        }
        TreeNode root = new TreeNode(postorder[po_s + po_len - 1]);
        boolean is_found = false;
        int len = 0;
        for(; len < po_len; len++) {
            if(inorder[in_s + len] == postorder[po_s + po_len - 1]) {
                is_found = true;
                break;
            }
        }
        if(!is_found) {
            return root;
        }
        root.left = dfs(inorder, in_s, len, postorder, po_s, len);
        root.right = dfs(inorder, in_s + len + 1, in_len - len - 1, postorder, po_s + len, po_len - len - 1);
        return root;
    }
}
