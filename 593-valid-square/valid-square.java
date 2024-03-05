class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> distSet = new HashSet<>();

        distSet.add(getDistanceSquare(p1, p2));
        distSet.add(getDistanceSquare(p1, p3));
        distSet.add(getDistanceSquare(p1, p4));
        distSet.add(getDistanceSquare(p2, p3));
        distSet.add(getDistanceSquare(p2, p4));
        distSet.add(getDistanceSquare(p3, p4));

        return !distSet.contains(0) && distSet.size() == 2;
    }
    private int getDistanceSquare(int[] p1, int[] p2) {
    return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
  }
}