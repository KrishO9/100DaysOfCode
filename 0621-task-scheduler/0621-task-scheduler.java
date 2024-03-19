class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] taskFrequencies = new int[26]; 
        int maxFrequency = 0;
        int maxFrequencyTasks = 0;

        for (char task : tasks) {
            int frequency = ++taskFrequencies[task - 'A'];
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxFrequencyTasks = 1;
            } else if (frequency == maxFrequency) {
                maxFrequencyTasks++;
            }
        }

        int intervals = (maxFrequency - 1) * (n + 1) + maxFrequencyTasks;
        return Math.max(intervals, tasks.length);
    }
}