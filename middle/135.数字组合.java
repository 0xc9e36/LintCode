public class Solution {
    /*
     * @param candidates: A list of integers
     * @param target: An integer
     * @return: A list of lists of integers
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // write your code here
        List<List<Integer>> list = new ArrayList();
        if(0 == candidates.length) {
            return list;
        }
        Arrays.sort(candidates);
        backtracking(candidates, list, new ArrayList(), target, 0);
        return list;
    }
    
    public void backtracking(int[] candidates,List<List<Integer>> list, List<Integer> temp, int target, int n) {
        if(0 == target) {
            if (!list.contains(temp)) {
                list.add(new ArrayList(temp));
                return ;
            }
        }
        int N = candidates.length;
        for(int i = n; i < N; i++) {
            if(candidates[i] > target) {
                break;
            }
            temp.add(candidates[i]);
            backtracking(candidates, list, temp, target - candidates[i], i);
            temp.remove(temp.size() - 1);
        }
        
    }
}
