public class Solution {
    /*
     * @param num: Given the candidate numbers
     * @param target: Given the target number
     * @return: All the combinations that sum to target
     */
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        // write your code here
        List<List<Integer>> list = new ArrayList();
        int N = num.length;
        if(0 == N) {
            return list;
        }
        int[] X = new int[N];
        Arrays.sort(num);
        backtracking(list, X, num, 0, target);
        return list;
    }
    
    public void backtracking(List<List<Integer>> list, int[] X, int[] num, int n, int target) {
        int N = X.length;
        if(target == 0) {
            List<Integer> temp = new ArrayList();
            for(int i = 0; i < N; i++) {
                if(X[i] > 1) {
                    return ;
                }
                if(X[i] == 1) {
                    temp.add(num[i]);
                }
                
            }
            if(!list.contains(temp)) {
                list.add(temp);
            }
            return ;
        }
        
        for(int j = n; j < N; j++) {
                if(num[j] > target) {
                    return ;    
                }
                if(0 == X[j]) {
                    X[j] = 1;
                    backtracking(list, X, num, j+1, target - num[j]);
                    X[j] = 0;
                }
            }
    }
}
