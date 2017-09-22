public class Solution {
    /*
     * @param A: Given an integer array
     * @return: nothing
     */
    public void heapify(int[] A) {
        // write your code here
        int N = A.length - 1;
        for(int k = N / 2; k >= 0; k--) {
            sink(A, k, N);
        }
    }
    
    public void sink(int[] A, int i, int N) {
        while((2 * i + 1) <= N) {
            int j = 2 * i + 1;
            if(j < N && A[j] > A[j + 1]) {
                j++;
            }
            if(A[i] < A[j]) {
                break;
            }
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i = j;
        }
    }
}
