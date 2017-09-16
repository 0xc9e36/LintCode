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


/*
 * 序列化的话采用前序遍历，空节点就用#代替，每个节点保存在队列中，遍历构造。 
 */


public class Solution {
    /**
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        // write your code here
        if(root == null) {
            return "#";
        }
        
        String s = String.valueOf(root.val);
        s = s + "," + serialize(root.left) + "," + serialize(root.right);
        return s;
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
        Queue<String> queue = new ArrayDeque();
        String[] arr = data.split(",");
        int N = arr.length;
        for(int i = 0; i < N; i++) {
            queue.add(arr[i]);
        }
        return dfs(queue);
    }
    
    public TreeNode dfs(Queue<String> queue) {
        String s = queue.poll(); 
        if(s.equals("#")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(s));
        root.left = dfs(queue);
        root.right = dfs(queue);
        return root;
    }
}

