public class Solution {
    /*
     * @param nums: A list of integers
     * @return: An integer denotes the middle number of the array
     */
    public int median(int[] nums) {
        // write your code here
        if(nums.length == 0) {
            return 0;
        }
        quickSort(nums, 0, nums.length - 1);
        return  nums.length % 2 == 1 ? nums[nums.length / 2] : nums[nums.length / 2 - 1];
    }
    
    public void quickSort(int[] nums, int l, int r) {
        if(l >= r) {
            return ;
        }
        int j = partation(nums, l, r);
        
        if(j == nums.length / 2) {
            return;
        }
        
        quickSort(nums, l, j - 1);
        quickSort(nums, j + 1, r);
    }
    
    public int partation(int[] num, int l, int r) {
        
        int v = num[l], i = l, j = r + 1;
        while(true) {
            while(num[++i] < v) {
                if(i == r) {
                    break;
                }
            }
            while(num[--j] > v) {
                if(i == l) {
                    break;
                }
            }
            if(i >= j) {
                break;
            }
            change(num, i, j);
        }
        change(num, l, j);
        return j;
    }
    
    public void change(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
