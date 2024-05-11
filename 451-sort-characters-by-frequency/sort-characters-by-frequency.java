class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        int[] count = new int[128];
        StringBuilder result = new StringBuilder();
        ArrayList<Node> arr = new ArrayList<>();

        for (char c : s.toCharArray()) {
            count[c]++;
        }

        for (int i = 0; i < 128; i++) {
            if (count[i] > 0) {
                arr.add(new Node((char) i, count[i]));
            }
        }

        Collections.sort(arr, (Node n1, Node n2) -> n2.fq - n1.fq); 
        for (int i = 0; i < arr.size(); i++) {
            Node node = arr.get(i);
            result.append(String.valueOf(node.ch).repeat(node.fq));
        }

        return result.toString();
    }
}
class Node{
    char ch;
    int fq;
    public Node(char c, int i){
        ch = c;
        fq = i;
    }
}