class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        ArrayList<int[]> merge = new ArrayList<>();
        merge.add(intervals[0]);
        for(int i=1; i<n; i++){
            int temp[] = merge.get(merge.size()-1);
            if(intervals[i][0]>temp[1]){
                merge.add(intervals[i]);
            }else{
                merge.get(merge.size()-1)[1] = Math.max(temp[1],intervals[i][1]);
            }
        }
        int result[][] = new int[merge.size()][2];
        for(int i=0; i<merge.size(); i++){
            result[i] = merge.get(i);
        }
        return result;
    }
}