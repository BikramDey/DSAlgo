class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c = 0;
        // for (char i : jewels.toCharArray()) {
        //     for (char j : stones.toCharArray()) {
        //         if (i == j) {
        //             c++;
        //         }
        //     }
        // }
        // Complexity O(m*n)

        Set s = new HashSet();
        for (char i : jewels.toCharArray()) {
            s.add(i);
        }
        for (char i : stones.toCharArray()) {
            if (s.contains(i)) {
                c++;
            }
        }
        // Complexity O(m+n)

        return c;
    }
}