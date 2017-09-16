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
 
 //很简单， 一次ac
public class Solution {
    /**
     * @param A: an integer array
     * @return: a tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {  
        // write your code here
        int N = A.length;
        if(N == 0) return null;
        return dfs(A, 0, N - 1);
    }  
    
    public TreeNode dfs(int[] A, int l, int r) {
        if(l > r) {
            return null;
        } else if (l == r) {
            return new TreeNode(A[l]);
        } 
        
        int index = l + (r - l) / 2;
        TreeNode root = new TreeNode(A[index]);
        root.left = dfs(A, l, index - 1);
        root.right = dfs(A, index + 1, r);
        return root;
    }
}
