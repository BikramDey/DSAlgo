class Solution {
    public int longestConsecutive(int[] nums) {
        // Create a hash set to store the unique elements of the array.
        Set<Integer> numSet = new HashSet<>();
      
        // Add all elements to the set.
        for (int num : nums) {
            numSet.add(num);
        }
      
        // Initialize the variable for the longest consecutive sequence.
        int longestStreak = 0;
      
        // Go through each element in the array.
        for (int num : nums) {
            // Check if current number is the beginning of a sequence.
            if (!numSet.contains(num - 1)) {
                // Initialize the current number as the potential start of the sequence.
                int currentNum = num;
                // Initialize the current streak length.
                int currentStreak = 1;
              
                // Expand the current streak if consecutive numbers are found.
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
              
                // Update the longest streak found so far.
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
      
        // Return the longest streak length.
        return longestStreak;
    }
}