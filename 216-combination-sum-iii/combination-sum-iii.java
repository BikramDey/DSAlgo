class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        allSubsets(1, k, n, new ArrayList<>(), ans);
        return ans;
    }
    private void allSubsets(int index, int k, int target, List<Integer> path, List<List<Integer>> ans) {
        if(target == 0 && k == 0){
            ans.add(new ArrayList<>(path));
        }
        if(target < 0 || k < 0){
            return ;
        }

        for (int i = index; i <= 9; ++i) {
            path.add(i);
            allSubsets(i+1, k-1, target - i, path, ans);
            path.remove(path.size() - 1);
        }
    }
}