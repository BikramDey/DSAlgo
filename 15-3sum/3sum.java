class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int k, i, j;
        Arrays.sort(nums);
        for(k=n-1; k>1; k--){
            if (k < n-1 && nums[k] == nums[k + 1])
                continue;
            j = k-1;
            i = 0;
            while(i<j){
                if(nums[i]+nums[j]+nums[k]==0){
                    result.add(Arrays.asList(nums[i++], nums[j--], nums[k]));
                    while (i < j && nums[i] == nums[i - 1])
                        ++i;
                    while (i < j && nums[j] == nums[j + 1])
                        --j;
                }
                if(nums[i]+nums[j]+nums[k]<0){
                    i++;
                }
                if(nums[i]+nums[j]+nums[k]>0){
                    j--;
                }
            }
        }
        return result;
    }
}