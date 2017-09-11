public class Solution {
    /*
     * @param A: an integer array
     * @return:
     */
    public void sortIntegers(int[] A) {
        // write your code here
        selectSort(A);
    }
    
    //插入排序
    public void insertSort(int[] A) {
        int N = A.length, j = 1, i, key;
        while(j < N) {
            i = j - 1;
            key = A[j];
            while(i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
            j++;
        }
    }
    
    //冒泡排序
    public void bubbleSort(int[] A) {
        int N = A.length;
        for(int i = 1; i < N; i++) {
            for(int j = N - 1; j >= i; j--) {
                if(A[j] < A[j - 1]) {
                    exch(A, j, j - 1);
                }
            }
        }
    }
    
    //选择排序
    public void selectSort(int[] A) {
        int N = A.length;
        int min ;
        for(int i = 0; i < N - 1; i++) {
            min = i;
            for(int j = i + 1; j < N; j++) {
                if(A[j] < A[min]) {
                    min = j;
                }
            }
            exch(A, i, min);
        }
        
    }
    
    
    // 交换元素
    public void exch(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
