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
     * @param root: A tree
     * @return: buttom-up level order a list of lists of integer
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // write your code here
        Queue<TreeNode> queue = new ArrayDeque();
        List<List<Integer>> list = new ArrayList();
        if(root == null) return list;
        queue.add(root);
        List<Integer> temp;
        while(queue.size() != 0) {
            int size = queue.size();
            temp = new ArrayList();
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
        int l = 0, r = list.size() - 1;
        while(l < r) {
            temp = list.get(l);
            list.set(l, list.get(r));
            list.set(r, temp);
            l++;
            r--;
        }
        
        return list;
    }
}
