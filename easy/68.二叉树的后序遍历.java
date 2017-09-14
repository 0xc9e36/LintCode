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
     * @return: Postorder in ArrayList which contains node values.
     */
    // 1. 递归遍历
    
    public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> list = new ArrayList();
        dfs(root, list);
        return list;
    }
    
    public void dfs(TreeNode root, List<Integer> list) {
        if(root == null) return ;
        dfs(root.left, list);
        dfs(root.right, list);
        list.add(root.val);
    }
    
    
    // 2. 迭代遍历
    /*
     *  真是巧妙这种办法，打死我也想不出
     *  只有左右子节点都遍历了才能把父节点加入List中，否则就去遍历左右节点，不过注意顺序是先右节点再左节点
     *
     */
     
    public List<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        List<Integer> list = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        if (root == null) return list;
        stack.push(root);
        while(!stack.empty()) {
            root = stack.peek();
            if (root.left == null && root.right == null) {
                list.add(root.val);
                stack.pop();
            } else {
                if (root.right != null) {
                    stack.push(root.right);
                    root.right = null;
                }
                if (root.left != null) {
                    stack.push(root.left);
                    root.left = null;
                    
                }
            }
            
        }
        return list;
    }    

}
