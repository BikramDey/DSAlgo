class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        ArrayList<int[]> arr = new ArrayList<>();
        for(int i = 0; i<n; i++){
            arr.add(intervals[i]);
        }
        Collections.sort(arr, (a,b) -> (a[0] - b[0]));
        //int s = arr.size();
        for(int i = 1; i<arr.size(); i++){
            int current[] = arr.get(i);
            int last[] = arr.get(i-1);
            if(current[0] <= last[1]){
                last[1] = Math.max(current[1], last[1]);
                arr.remove(i);
                i--;
            }
        }
        int newintervals[][] = new int[arr.size()][2];
        int j = 0;
        for(int item[] : arr){
            newintervals[j][0] = item[0];
            newintervals[j][1] = item[1];
            j++;
        }
        return newintervals;
    }
}