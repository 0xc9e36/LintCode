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
     * @param root: A Tree
     * @return: Inorder in ArrayList which contains node values.
     */
     
    // 1. 递归遍历

    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> list = new ArrayList();
        dfs(root, list);
        return list;
    }
    
    public void dfs(TreeNode root, List<Integer> list) {
        if(root == null) return ;
        dfs(root.left, list);
        list.add(root.val);
        dfs(root.right, list);
    }

    // 2. 迭代遍历
    /*
     * 卡了好久没写出来
     * 思路：根加点加入栈中， 然后将其所有左子节点都加入栈中， 栈顶元素出栈，并将其值加入list中
     * 当前节点指向出栈元素的右子节点， 在下一次循环中将会重复上述操作，即可保证遍历顺序为 左，根，右。
     *
     *
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> list = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        TreeNode node = root;
        while(node != null || stack.size() != 0) {
            while(node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            list.add(node.val);
            node = node.right;
        }
        return list;
    }
}
