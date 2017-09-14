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
     * @return: Level order a list of lists of integer
     */
     
     /*
      * 哈哈， 还算顺利，十分钟写完了
      * 主要是利用队列先进先出， 逐层遍历
      *
      */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // write your code here
        Queue<TreeNode> queue = new ArrayDeque();
        List<List<Integer>> list = new ArrayList();
        if(root == null) return list;
        queue.add(root);
        while(queue.size() != 0) {
            int size = queue.size();
            List<Integer> temp = new ArrayList();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            list.add(temp);
        }
        return list;
    }
}
