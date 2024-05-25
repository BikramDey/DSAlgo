class Solution {
    public int leastInterval(char[] tasks, int n) {
        int time = 0;
        int[] freq = new int[26];
        PriorityQueue<Task> pq = new PriorityQueue<>((a, b) -> b.count - a.count);

        for(char task: tasks) {
            freq[task-'A']++;
        }

        for(int i=0; i<26; i++) {
            if(freq[i]>=1)
                pq.add(new Task(0, freq[i]));
        }
        Queue<Task> q = new LinkedList<>();
        while(!pq.isEmpty() || !q.isEmpty()) {

            if(!q.isEmpty() && (time-q.peek().time)>n) {
                pq.add(q.remove());
            }

            if(!pq.isEmpty()) {
                Task t = pq.remove();
                t.count--;
                t.time=time;
                if(t.count>0) {
                    q.add(t);
                }
            }

            time++;
        }
        return time;
    }
    class Task{
        int time, count;
        public Task(int t, int c){
            time = t;
            count = c;
        }
    }
}
    
