class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> r = new ArrayList<>();
        Combinations(candidates, target, 0, new ArrayList<Integer>(), r);
        return r;
    }
    public static void Combinations(int[] a, int t, int index, ArrayList<Integer> c, List<List<Integer>> r) {
        if(t < 0){
            return;
        }
        if(t == 0){
            r.add(new ArrayList<>(c));
            return;
        }
        
        for(int i=index;i<a.length;i++){
            if(i>index && a[i]==a[i-1])
                continue;

            if(t-a[i]>=0){
                c.add(a[i]);
                Combinations(a, t-a[i], i+1, c, r);
                c.remove(c.size()-1);
            }
        }
    }
}
