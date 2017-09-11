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
     * @return: Preorder in ArrayList which contains node values.
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
    	List<Integer> list = new ArrayList();
    	dfs(root, list);
    	return list;
    }
    
    public void dfs(TreeNode root, List<Integer> list) {
    	if(root == null) return ;
    	list.add(root.val);
    	dfs(root.left, list);
    	dfs(root.right, list);
    }
}
