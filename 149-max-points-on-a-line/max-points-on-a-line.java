class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n < 3)
            return n;

        int result = 0;

        for (int i = 0; i < n; i++) {
            HashMap<Double, Integer> slopeMap = new HashMap<>();
            int max=0;
            for (int j = i + 1; j < n; j++) {
                int num=(points[j][0]-points[i][0]);
                int den=(points[j][1]-points[i][1]);
                double slope = (den==0)? Double.POSITIVE_INFINITY:(double)num/den;

                if(slope==0) 
                    slope=0;
                    
                slopeMap.put(slope, slopeMap.getOrDefault(slope, 0) + 1);
                max = Math.max(slopeMap.get(slope),max);
            }
            result = Math.max(result,max);
        }

        return result + 1;
    }
}