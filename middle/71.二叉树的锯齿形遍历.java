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
     * @return: A list of lists of integer include the zigzag level order traversal of its nodes' values.
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // write your code here
        Queue<TreeNode> queue = new ArrayDeque();
        List<List<Integer>> list = new ArrayList();
        if(root == null) {
            return list;
        }
        queue.add(root);
        int flag = 0;
        while(queue.size() != 0) {
            List<Integer> temp = new ArrayList();
            int N = queue.size();
            for(int i = 0; i < N; i++) {
                root = queue.poll();
                temp.add(root.val);
                if(root.left != null) {
                    queue.add(root.left);
                }
                if(root.right != null) {
                    queue.add(root.right);
                }
            }
            
            int l = 0, r = temp.size() - 1;
            if(flag % 2 == 1) {
                while(l < r) {
                    int val = temp.get(l);
                    temp.set(l, temp.get(r));
                    temp.set(r, val);
                    l++;
                    r--;
                }                
            }
            flag++;
            list.add(temp);
        }
        return list;
    }
}


/*层序遍历一回事，没多大难度*/
