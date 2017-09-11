public class Solution {
    /*
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        int height = matrix.length - 1; 
        if(-1 == height) return false;
        int right = matrix[0].length - 1; 
        int top = 0, left = 0;
        int line = 0;
        while(top <= height) {
            line = top + (height - top) / 2;
            if(matrix[line][0] < target) {
                top = line + 1;
            } else if (matrix[line][0] > target) {
                height = line - 1;
            } else {
                return true;
            }
        }
        if(height < 0) return false;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[height][mid] == target) {
                return true;
            } else if (matrix[height][mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            } 
        }
        return false;
    }
    
}

/*
 * 二分：先找出在哪一行， 然后再做一次二分
 */
