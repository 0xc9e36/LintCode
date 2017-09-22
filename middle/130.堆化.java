public class Solution {
    /*
     * @param A: Given an integer array
     * @return: nothing
     */
    public void heapify(int[] A) {
        // write your code here
        int N = A.length - 1;
        if (N == 0) {
            return ;
        }
        for(int k = N / 2; k >= 0; k--) {
            sink(A, k);
        }
    }
    
    public void sink(int[] A, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int min = i;
        if(left < A.length && A[left] < A[min]) {
            min = left;
        }
        if(right < A.length && A[right] < A[min]) {
            min = right;
        }
        if(min != i) {
            int temp = A[min];
            A[min] = A[i];
            A[i] = temp;
            sink(A, min);
        }
    }
}
