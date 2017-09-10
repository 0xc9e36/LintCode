public class Solution {
    /*
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int len_a = A.length;
        int len_b = B.length;
        int[] sort_arr = new int[len_a + len_b];
        
        int i = 0, j = 0, k = 0;
        while(i < len_a && j < len_b) {
        	if(A[i] <= B[j]) {
        		sort_arr[k++] = A[i++];
        	} else {
        		sort_arr[k++] = B[j++];
        	}
        }
        while(i < len_a){ sort_arr[k++] = A[i++];}
        while(j < len_b){ sort_arr[k++] = B[j++];}
        return sort_arr;
    }
}
