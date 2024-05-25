class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] fq = new int[26];
        int maxfq = 0;

        for (char task : tasks) {
            int index = task - 'A';
            fq[index]++;
            
            maxfq = Math.max(maxfq, fq[index]);
        }

        int maxFqCount = 0;
        for (int count : fq) {
            if (count == maxfq) {
                maxFqCount++;
            }
        }
        int result = Math.max(tasks.length, (maxfq - 1) * (n + 1) + maxFqCount);

        return result;
    }
}