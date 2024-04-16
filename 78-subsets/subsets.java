class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        create(0, nums, new ArrayList<>(), ls);
        
        return ls;
    }
    private void create(int p, int[] nums, List<Integer> arr, List<List<Integer>> ls){

        ls.add(new ArrayList<>(arr));
        
        for(int i = p; i<nums.length; i++){
            arr.add(nums[i]);
            create(i+1, nums, arr, ls);
            arr.remove(arr.size() - 1);
        }
            
    }
}