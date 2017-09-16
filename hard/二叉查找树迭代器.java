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
 * Example of iterate a tree:
 * BSTIterator iterator = new BSTIterator(root);
 * while (iterator.hasNext()) {
 *    TreeNode node = iterator.next();
 *    do something for node
 * } 
 */


// 为什么这么简单这个题目
public class BSTIterator {
    Queue<TreeNode> queue = new ArrayDeque();
    /*
    * @param root: The root of binary tree.
    */public BSTIterator(TreeNode root) {
        // do intialization if necessary
        if (root != null) {
            Stack<TreeNode> stack = new Stack();
            while(root != null || stack.size() != 0) {
                while(root != null) {
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                queue.add(root);
                root = root.right;
            }
        }
    }

    /*
     * @return: True if there has next node, or false
     */
    public boolean hasNext() {
        // write your code here
        return queue.size() != 0;
    }

    /*
     * @return: return next node
     */
    public TreeNode next() {
        // write your code here
        return queue.poll();
    }
}
