class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        boolean v[]=new boolean[n];
        backTrack(nums,v,0,new ArrayList<>(), result);
        return result;
    }
    private static void backTrack(int a[], boolean v[], int k, List<Integer> c, List<List<Integer>> r) {
        if(k == a.length){
            r.add(new ArrayList<>(c));
            return;
        }
        
        for(int i=0;i<a.length;i++){
            if(v[i])
                continue;
            else{
                v[i]=true;
                c.add(a[i]);
                backTrack(a, v, k+1, c, r);
                c.remove(c.size() - 1);
                v[i] = false;
            }
        }
    }
}