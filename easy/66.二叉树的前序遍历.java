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
     
    // 1. 递归遍历，这种方法很好理解.
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
    */
    
    // 2. 非递归遍历，用栈模拟
    public List<Integer> preorderTraversal(TreeNode root) {
        // write your code here
    	List<Integer> list = new ArrayList();
    	if(root == null) return list;
    	Stack<TreeNode> stack = new Stack();
    	stack.push(root);
    	while(stack.size() != 0) {
    	    TreeNode node = stack.pop();
    	    list.add(node.val);
    	    //栈的特点是后进先出，所以右孩子节点要先入栈
    	    if(node.right != null) {
    	        stack.push(node.right);
    	    }
    	    if(node.left != null) {
    	        stack.push(node.left);
    	    }
    	}
    	return list;
     }
    
}
