class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        int i, j;
        for(i=1; i<=numRows; i++){
            Integer arr[] = new Integer[i];
            Arrays.fill(arr, 1);
            result.add(Arrays.asList(arr));
        }
        for(i=2; i<numRows; i++){
            for(j=1; j<result.get(i).size()-1; j++){
                result.get(i).set(j, result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
        }
        return result;
    }
}